package com.example.proyectopmdmtiendavideojuegos.view.navigation

sealed class NavRoutes(val route: String) {

    object Home : NavRoutes("home")
    object Consolas : NavRoutes("consolas")
    object Categorias : NavRoutes("categorias")
    object Login : NavRoutes("login")
    object Perfil : NavRoutes("perfil")

    object Detail : NavRoutes("detail/{id}") {
        fun createRoute(id: Int) = "detail/$id"
    }

    object JuegosPorCategoria : NavRoutes("juegosPorCategoria/{categoriaId}") {
        fun createRoute(categoriaId: Int) = "juegosPorCategoria/$categoriaId"
    }

    object JuegosPorConsola : NavRoutes("juegosPorConsola/{consolaId}") {
        fun createRoute(consolaId: Int) = "juegosPorConsola/$consolaId"
    }
}
