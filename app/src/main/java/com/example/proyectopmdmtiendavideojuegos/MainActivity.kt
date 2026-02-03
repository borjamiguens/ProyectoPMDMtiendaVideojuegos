package com.example.proyectopmdmtiendavideojuegos

import Search
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.proyectopmdmtiendavideojuegos.data.repository.Categoria
import com.example.proyectopmdmtiendavideojuegos.data.repository.Consola
import com.example.proyectopmdmtiendavideojuegos.data.repository.VideojuegoData
import com.example.proyectopmdmtiendavideojuegos.model.MyListItem
import com.example.proyectopmdmtiendavideojuegos.view.component.BottomBarButton
import com.example.proyectopmdmtiendavideojuegos.view.component.Logo
import com.example.proyectopmdmtiendavideojuegos.view.navigation.NavRoutes
import com.example.proyectopmdmtiendavideojuegos.pages.*
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme
import com.example.proyectopmdmtiendavideojuegos.view.page.DetailPage
import com.example.proyectopmdmtiendavideojuegos.view.page.GenericListPage
import com.example.proyectopmdmtiendavideojuegos.view.page.Login
import com.example.proyectopmdmtiendavideojuegos.view.page.MainPage
import com.example.proyectopmdmtiendavideojuegos.view.page.ProfilePage

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {

            var isDarkMode by rememberSaveable { mutableStateOf(true) }

            val navController = rememberNavController()

            ProyectoPMDMtiendaVideojuegosTheme(darkTheme = isDarkMode) {

                Scaffold(
                    containerColor = if (isDarkMode) Color(0xFF0d0d0d) else Color.White,

                    topBar = {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFF0d0d0d))
                                .statusBarsPadding()
                                .padding(horizontal = 15.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Logo(
                                modifier = Modifier
                                    .padding(bottom = 15.dp),
                                logo = R.drawable.imagen_prueba,
                                name = "NOMBRE"
                            ) {
                                navController.navigate(NavRoutes.Home.route) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }
                            }

                            Spacer(modifier = Modifier.width(15.dp))

                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .height(55.dp)
                                    .padding(bottom = 10.dp)
                            ) {
                                Search { }
                            }

                            Spacer(modifier = Modifier.width(10.dp))

                            IconButton(
                                onClick = { isDarkMode = !isDarkMode }
                            ) {
                                Icon(
                                    imageVector = if (isDarkMode)
                                        Icons.Default.LightMode
                                    else
                                        Icons.Default.DarkMode,
                                    contentDescription = "Cambiar tema",
                                    tint = Color.White
                                )
                            }
                        }
                    },

                    bottomBar = {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFF0d0d0d))
                                .padding(vertical = 10.dp),
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            BottomBarButton(Icons.Filled.Home, "HOME") {
                                navController.navigate(NavRoutes.Home.route) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }
                            }
                            BottomBarButton(Icons.Filled.VideogameAsset, "CONSOLAS") {
                                navController.navigate(NavRoutes.Consolas.route) {
                                    launchSingleTop = true
                                }
                            }
                            BottomBarButton(Icons.Filled.Category, "CATEGORIAS") {
                                navController.navigate(NavRoutes.Categorias.route) {
                                    launchSingleTop = true
                                }
                            }
                            BottomBarButton(Icons.Filled.Login, "LOGIN") {
                                navController.navigate(NavRoutes.Login.route) {
                                    launchSingleTop = true
                                }
                            }
                            BottomBarButton(Icons.Filled.Person, "PERFIL") {
                                navController.navigate(NavRoutes.Perfil.route) {
                                    launchSingleTop = true
                                }
                            }
                        }
                    }
                ) { innerPadding ->

                    NavHost(
                        navController = navController,
                        startDestination = NavRoutes.Home.route,
                        modifier = Modifier.padding(innerPadding)
                    ) {

                        composable(NavRoutes.Home.route) {
                            MainPage { id ->
                                navController.navigate(NavRoutes.Detail.createRoute(id))
                            }
                        }

                        composable(
                            route = NavRoutes.Detail.route,
                            arguments = listOf(navArgument("id") { type = NavType.IntType })
                        ) { backStackEntry ->
                            val id = backStackEntry.arguments?.getInt("id") ?: 0
                            val juego = VideojuegoData.listaVideojuegos.first { it.id == id }

                            DetailPage(
                                juegoId = id
                            )
                        }

                        composable(NavRoutes.Categorias.route) {
                            GenericListPage(
                                title = "CATEGORÍAS",
                                items = Categoria.entries.mapIndexed { index, categoria ->
                                    MyListItem(
                                        name = stringResource(categoria.nameResId),
                                        imageResId = categoria.imageResId,
                                        id = index
                                    )
                                }
                            ) { categoriaItem ->
                                navController.navigate(
                                    NavRoutes.JuegosPorCategoria.createRoute(categoriaItem.id)
                                )
                            }
                        }

                        composable(
                            NavRoutes.JuegosPorCategoria.route,
                            arguments = listOf(navArgument("categoriaId") { type = NavType.IntType })
                        ) { backStackEntry ->
                            val categoriaId = backStackEntry.arguments?.getInt("categoriaId") ?: 0
                            val categoria = Categoria.entries[categoriaId]

                            GenericListPage(
                                title = "JUEGOS DE ${stringResource(categoria.nameResId)}",
                                items = VideojuegoData.listaVideojuegos
                                    .filter { it.categoria == categoria }
                                    .map { juego ->
                                        MyListItem(
                                            name = juego.nombre,
                                            imageResId = juego.imagenResId,
                                            id = juego.id
                                        )
                                    }
                            ) { juegoItem ->
                                navController.navigate(NavRoutes.Detail.createRoute(juegoItem.id))
                            }
                        }

                        composable(NavRoutes.Consolas.route) {
                            GenericListPage(
                                title = "CONSOLAS",
                                items = Consola.values()
                                    .mapIndexed { index, consola ->
                                        MyListItem(
                                            name = consola.consoleName,
                                            imageResId = consola.imageResId,
                                            id = index
                                        )
                                    }
                            ) { consolaItem ->
                                navController.navigate(
                                    NavRoutes.JuegosPorConsola.createRoute(consolaItem.id)
                                )
                            }
                        }

                        composable(
                            NavRoutes.JuegosPorConsola.route,
                            arguments = listOf(navArgument("consolaId") { type = NavType.IntType })
                        ) { backStackEntry ->
                            val consolaId = backStackEntry.arguments?.getInt("consolaId") ?: 0
                            val consola = com.example.proyectopmdmtiendavideojuegos.data.repository.Consola.values()[consolaId]

                            GenericListPage(
                                title = "JUEGOS DE ${consola.consoleName}",
                                items = VideojuegoData.listaVideojuegos
                                    .filter { it.consola.contains(consola) }
                                    .map { juego ->
                                        MyListItem(
                                            name = juego.nombre,
                                            imageResId = juego.imagenResId,
                                            id = juego.id
                                        )
                                    }
                            ) { juegoItem ->
                                navController.navigate(NavRoutes.Detail.createRoute(juegoItem.id))
                            }
                        }

                        composable(NavRoutes.Login.route) { Login() }

                        composable(NavRoutes.Perfil.route) { ProfilePage() }

                    }
                }
            }
        }
    }
}
