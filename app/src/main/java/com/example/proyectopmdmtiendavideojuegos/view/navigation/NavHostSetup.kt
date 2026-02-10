package com.example.proyectopmdmtiendavideojuegos.view.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.proyectopmdmtiendavideojuegos.domain.model.Categoria
import com.example.proyectopmdmtiendavideojuegos.data.data.Consola
import com.example.proyectopmdmtiendavideojuegos.data.data.VideojuegoData
import com.example.proyectopmdmtiendavideojuegos.model.MyListItem
import com.example.proyectopmdmtiendavideojuegos.pages.DetailPageVM
import com.example.proyectopmdmtiendavideojuegos.view.page.*
import com.example.proyectopmdmtiendavideojuegos.viewModel.vm.GenericListPageVM
import com.example.proyectopmdmtiendavideojuegos.viewModel.vm.LoginPageVM
import com.example.proyectopmdmtiendavideojuegos.viewModel.vm.MainPageVM
import com.example.proyectopmdmtiendavideojuegos.viewModel.vm.ProfilePageVM

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavRoutes.Home.route) {

        // -------------------- MainPage --------------------
        composable(NavRoutes.Home.route) {
            val vm: MainPageVM = viewModel()
            MainPage(
                modifier = Modifier.fillMaxSize(),
                onJuegoClick = { id ->
                    navController.navigate(NavRoutes.Detail.createRoute(id))
                }
            )
        }

        // -------------------- Consolas --------------------
        composable(NavRoutes.Consolas.route) {
            val vm: GenericListPageVM = viewModel()
            GenericListPage(
                title = "CONSOLAS",
                items = Consola.values().mapIndexed { index, consola ->
                    MyListItem(
                        name = consola.consoleName,
                        imageResId = consola.imageResId,
                        id = index
                    )
                },
                onItemClick = { item ->
                    navController.navigate(NavRoutes.JuegosPorConsola.createRoute(item.id))
                },
                viewModel = vm
            )
        }

        // -------------------- Categorías --------------------
        composable(NavRoutes.Categorias.route) {
            val vm: GenericListPageVM = viewModel()
            GenericListPage(
                title = "CATEGORÍAS",
                items = Categoria.entries.mapIndexed { index, categoria ->
                    MyListItem(
                        name = stringResource(id = categoria.nameResId),
                        imageResId = categoria.imageResId,
                        id = index
                    )
                },
                onItemClick = { item ->
                    navController.navigate(NavRoutes.JuegosPorCategoria.createRoute(item.id))
                },
                viewModel = vm
            )
        }

        // -------------------- Login --------------------
        composable(NavRoutes.Login.route) {
            val vm: LoginPageVM = viewModel()
            Login()
        }

        // -------------------- Profile --------------------
        composable(NavRoutes.Perfil.route) {
            val vm: ProfilePageVM = viewModel()
            ProfilePage(
                viewModel = vm,
                onCameraClick = { println("Abrir cámara") },
            )
        }

        // -------------------- DetailPage --------------------
        composable(
            NavRoutes.Detail.route,
            arguments = listOf(navArgument("id") { type = NavType.IntType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("id") ?: 0
            val vm: DetailPageVM = viewModel()
            DetailPage(
                juegoId = id,
                viewModel = vm
            )
        }

        // -------------------- Juegos por Categoría --------------------
        composable(
            NavRoutes.JuegosPorCategoria.route,
            arguments = listOf(navArgument("categoriaId") { type = NavType.IntType })
        ) { backStackEntry ->
            val categoriaId = backStackEntry.arguments?.getInt("categoriaId") ?: 0
            val vm: GenericListPageVM = viewModel()
            GenericListPage(
                title = "JUEGOS DE ${stringResource(Categoria.entries[categoriaId].nameResId)}",
                items = VideojuegoData.listaVideojuegos.filter {
                    it.categoria.ordinal == categoriaId
                }.map { juego ->
                    MyListItem(
                        name = juego.nombre,
                        imageResId = juego.imagenResId,
                        id = juego.id
                    )
                },
                onItemClick = { item ->
                    navController.navigate(NavRoutes.Detail.createRoute(item.id))
                },
                viewModel = vm
            )
        }

        // -------------------- Juegos por Consola --------------------
        composable(
            NavRoutes.JuegosPorConsola.route,
            arguments = listOf(navArgument("consolaId") { type = NavType.IntType })
        ) { backStackEntry ->
            val consolaId = backStackEntry.arguments?.getInt("consolaId") ?: 0
            val vm: GenericListPageVM = viewModel()
            GenericListPage(
                title = "JUEGOS DE ${Consola.values()[consolaId].consoleName}",
                items = VideojuegoData.listaVideojuegos.filter { juego ->
                    juego.consola.any { it.ordinal == consolaId }
                }.map { juego ->
                    MyListItem(
                        name = juego.nombre,
                        imageResId = juego.imagenResId,
                        id = juego.id
                    )
                },
                onItemClick = { item ->
                    navController.navigate(NavRoutes.Detail.createRoute(item.id))
                },
                viewModel = vm
            )
        }
    }
}
