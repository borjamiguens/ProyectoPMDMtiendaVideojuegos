package com.example.proyectopmdmtiendavideojuegos.data.model

import com.example.proyectopmdmtiendavideojuegos.R

enum class Consola(val consoleName: String, val imageResId: Int) {
    NINTENDO_SWITCH(consoleName = "Nintendo Switch", imageResId = R.drawable.imagen_prueba),
    PLAYSTATION_5(consoleName = "PlayStation 5", imageResId = R.drawable.imagen_prueba),
    PLAYSTATION_4(consoleName = "PlayStation 4", imageResId = R.drawable.imagen_prueba),
    XBOX_SERIES_X(consoleName = "Xbox Series X", imageResId = R.drawable.imagen_prueba),
    XBOX_ONE(consoleName = "Xbox One", imageResId = R.drawable.imagen_prueba),
    PC(consoleName = "PC", imageResId = R.drawable.imagen_prueba),
    NINTENDO_3DS(consoleName = "Nintendo 3DS", imageResId = R.drawable.imagen_prueba),
    PLAYSTATION_VITA(consoleName = "PlayStation Vita", imageResId = R.drawable.imagen_prueba)

}