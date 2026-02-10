package com.example.proyectopmdmtiendavideojuegos.data.mapper

import com.example.proyectopmdmtiendavideojuegos.data.dto.VideojuegoDto
import com.example.proyectopmdmtiendavideojuegos.domain.model.Videojuego
import com.example.proyectopmdmtiendavideojuegos.domain.model.Categoria
import com.example.proyectopmdmtiendavideojuegos.domain.model.Consola

// Extensión global: VideojuegoDto -> Videojuego
fun VideojuegoDto.toDomain(): Videojuego {
    return Videojuego(
        id = this.id,
        nombre = this.nombre,
        descripcion = this.descripcion,
        categoria = try {
            Categoria.valueOf(this.categoria.uppercase())
        } catch (e: Exception) {
            Categoria.OTRO
        },
        consola = this.consola.mapNotNull { consolaStr ->
            try {
                Consola.valueOf(consolaStr.uppercase())
            } catch (e: Exception) {
                null
            }
        },
        precio = this.precio,
        unidadesDisponibles = this.unidadesDisponibles,
        numAlquilados = this.numAlquilados,
        imagenResId = 0 // Reemplaza si quieres usar URL con Coil
    )
}

// Función de extensión para listas
fun List<VideojuegoDto>.toDomainList(): List<Videojuego> = this.map { it.toDomain() }
