package com.example.proyectopmdmtiendavideojuegos.model

import com.example.proyectopmdmtiendavideojuegos.R

// Data class para ListPageTemplate.
// Se guarda el título, la imagen y el id del elemento,
// permitiendo listar cada elemento escogido con un ImageTextRow (recibe un String y una imagen)
data class MyListItem(
    val id: Int,            // <-- ID del juego o categoría
    val name: String,       // Titulo
    val imageResId: Int = R.drawable.imagen_prueba // Imagen
)
