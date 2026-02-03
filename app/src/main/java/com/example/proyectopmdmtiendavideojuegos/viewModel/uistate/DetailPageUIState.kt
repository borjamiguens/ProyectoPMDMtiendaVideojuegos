package com.example.proyectopmdmtiendavideojuegos.pages

import com.example.proyectopmdmtiendavideojuegos.data.repository.Consola
import com.example.proyectopmdmtiendavideojuegos.model.Videojuego

data class DetailPageUIState(
    val txtTitle: String = "",
    val txtCategoria: String = "",
    val txtDescripcion: String = "",
    val consolas: List<Consola> = emptyList(),
    val precio: Double = 0.0,
    val unidadesDisponibles: Int = 0,
    val imagenResId: Int = 0,
    val isLoading: Boolean = true
) {
    companion object {
        fun fromVideojuego(juego: Videojuego): DetailPageUIState {
            return DetailPageUIState(
                txtTitle = juego.nombre,
                txtCategoria = juego.categoria.name,
                txtDescripcion = juego.descripcion,
                consolas = juego.consola,
                precio = juego.precio,
                unidadesDisponibles = juego.unidadesDisponibles,
                imagenResId = juego.imagenResId,
                isLoading = false
            )
        }
    }
}

