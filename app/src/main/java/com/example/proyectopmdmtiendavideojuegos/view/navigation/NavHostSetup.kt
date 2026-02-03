package com.example.proyectopmdmtiendavideojuegos.view.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.proyectopmdmtiendavideojuegos.data.repository.Categoria
import com.example.proyectopmdmtiendavideojuegos.data.repository.Consola
import com.example.proyectopmdmtiendavideojuegos.data.repository.VideojuegoData
import com.example.proyectopmdmtiendavideojuegos.model.MyListItem
import com.example.proyectopmdmtiendavideojuegos.view.page.DetailPage
import com.example.proyectopmdmtiendavideojuegos.view.page.GenericListPage
import com.example.proyectopmdmtiendavideojuegos.view.page.Login
import com.example.proyectopmdmtiendavideojuegos.view.page.MainPage
import com.example.proyectopmdmtiendavideojuegos.view.page.ProfilePage

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavRoutes.Home.route) {

        composable(NavRoutes.Home.route) {
            MainPage { id ->
                navController.navigate(NavRoutes.Detail.createRoute(id))
            }
        }

        composable(NavRoutes.Consolas.route) {
            GenericListPage(
                title = "CONSOLAS",
                items = Consola.values().mapIndexed { index, consola ->
                    MyListItem(
                        name = consola.consoleName,
                        imageResId = consola.imageResId,
                        id = index
                    )
                }
            ) { item ->
                navController.navigate(NavRoutes.JuegosPorConsola.createRoute(item.id))
            }
        }

        composable(NavRoutes.Categorias.route) {
            GenericListPage(
                title = "CATEGORÍAS",
                items = Categoria.entries.mapIndexed { index, categoria ->
                    MyListItem(
                        name = stringResource(id = categoria.nameResId),
                        imageResId = categoria.imageResId,
                        id = index
                    )
                }
            ) { item ->
                navController.navigate(NavRoutes.JuegosPorCategoria.createRoute(item.id))
            }
        }

        composable(NavRoutes.Login.route) { Login() }
        composable(NavRoutes.Perfil.route) { ProfilePage() }

        composable(
            NavRoutes.Detail.route,
            arguments = listOf(navArgument("id") { type = NavType.IntType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("id") ?: 0

            DetailPage(
                juegoId = id
            )
        }

        composable(
            NavRoutes.JuegosPorCategoria.route,
            arguments = listOf(navArgument("categoriaId") { type = NavType.IntType })
        ) { backStackEntry ->
            val categoriaId = backStackEntry.arguments?.getInt("categoriaId") ?: 0
            val juegosFiltrados = VideojuegoData.listaVideojuegos.filter {
                it.categoria.ordinal == categoriaId
            }

            GenericListPage(
                title = "JUEGOS POR CATEGORÍA",
                items = juegosFiltrados.map { juego ->
                    MyListItem(
                        name = juego.nombre,
                        imageResId = juego.imagenResId,
                        id = juego.id
                    )
                }
            ) { item ->
                navController.navigate(NavRoutes.Detail.createRoute(item.id))
            }
        }

        composable(
            NavRoutes.JuegosPorConsola.route,
            arguments = listOf(navArgument("consolaId") { type = NavType.IntType })
        ) { backStackEntry ->
            val consolaId = backStackEntry.arguments?.getInt("consolaId") ?: 0
            val juegosFiltrados = VideojuegoData.listaVideojuegos.filter {
                it.consola.any { c -> c.ordinal == consolaId }
            }

            GenericListPage(
                title = "JUEGOS POR CONSOLA",
                items = juegosFiltrados.map { juego ->
                    MyListItem(
                        name = juego.nombre,
                        imageResId = juego.imagenResId,
                        id = juego.id
                    )
                }
            ) { item ->
                navController.navigate(NavRoutes.Detail.createRoute(item.id))
            }
        }
    }
}
