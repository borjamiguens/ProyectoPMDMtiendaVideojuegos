package com.example.proyectopmdmtiendavideojuegos.data.api

import com.example.proyectopmdmtiendavideojuegos.data.dto.VideojuegoDto
import retrofit2.http.GET
import retrofit2.http.Path

interface VideojuegoApi {

    // Obtener lista de videojuegos
    @GET("videojuegos")
    suspend fun getVideojuegos(): List<VideojuegoDto>

    // Obtener un videojuego por ID
    @GET("videojuegos/{id}")
    suspend fun getVideojuego(
        @Path("id") id: Int
    ): VideojuegoDto
}
