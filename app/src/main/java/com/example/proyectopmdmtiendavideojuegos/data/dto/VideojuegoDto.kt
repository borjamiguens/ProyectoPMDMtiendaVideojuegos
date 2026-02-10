package com.example.proyectopmdmtiendavideojuegos.data.dto

data class VideojuegoDto(
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val categoria: String,
    val consola: List<String>,
    val precio: Double,
    val unidadesDisponibles: Int,
    val numAlquilados: Int,
    val imagenUrl: String
)
