package com.example.proyectopmdmtiendavideojuegos.data.model

import androidx.annotation.DrawableRes

data class Videojuego(
    val id: Int = 0,
    val nombre: String,
    val categoria: Categoria,
    val consola: List<Consola>,
    val precio: Double,
    val imagenUrl: String
)
