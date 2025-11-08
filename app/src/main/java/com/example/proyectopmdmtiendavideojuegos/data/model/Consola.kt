package com.example.proyectopmdmtiendavideojuegos.data.model

import com.example.proyectopmdmtiendavideojuegos.R

enum class Consola(val consoleName: String, val imageResId: Int) {
    NINTENDO_SWITCH(consoleName = "Nintendo Switch", imageResId = R.drawable.consola_nintendo_switch),
    PLAYSTATION_5(consoleName = "PlayStation 5", imageResId = R.drawable.consola_sony_ps5),
    PLAYSTATION_4(consoleName = "PlayStation 4", imageResId = R.drawable.consola_sony_ps4),
    XBOX_SERIES_X(consoleName = "Xbox Series X", imageResId = R.drawable.consola_microsoft_xbox_series_x),
    XBOX_ONE(consoleName = "Xbox One", imageResId = R.drawable.consola_microsoft_xbox_one),
    PC(consoleName = "PC", imageResId = R.drawable.consola_pc),
    NINTENDO_3DS(consoleName = "Nintendo 3DS", imageResId = R.drawable.consola_nintendo_3ds),
    PLAYSTATION_VITA(consoleName = "PlayStation Vita", imageResId = R.drawable.consola_psvita)

}