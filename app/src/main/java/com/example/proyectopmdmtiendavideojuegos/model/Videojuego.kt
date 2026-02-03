package com.example.proyectopmdmtiendavideojuegos.model

import com.example.proyectopmdmtiendavideojuegos.data.repository.Categoria
import com.example.proyectopmdmtiendavideojuegos.data.repository.Consola

// Clase videojuego
data class Videojuego(
    val id: Int = 0,
    val nombre: String,
    val descripcion: String = "Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. Esta es la descripción del juego. ",
    val categoria: Categoria,
    val consola: List<Consola>,
    val precio: Double = 0.0,
    val unidadesDisponibles: Int = 0,
    val numAlquilados: Int = 0,
    val imagenResId: Int
)