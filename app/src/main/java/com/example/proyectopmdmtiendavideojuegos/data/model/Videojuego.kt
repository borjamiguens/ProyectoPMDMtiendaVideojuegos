package com.example.proyectopmdmtiendavideojuegos.data.model

import androidx.annotation.DrawableRes

data class Videojuego(
    val id: Int = 0,
    val nombre: String,
    val descripcion: String = "Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. ",
    val categoria: Categoria,
    val consola: List<Consola>,
    val precio: Double,
    val unidadesDisponibles: Int,
    val numAlquilados: Int,
    val imagenResId: Int
)