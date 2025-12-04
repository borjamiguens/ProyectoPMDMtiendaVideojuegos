package com.example.proyectopmdmtiendavideojuegos.data.model

import androidx.annotation.StringRes

data class ImageTextColumnData(
    val txtTitle: String,
    @StringRes val categoria: Int,
    val txtConsola: String,
    val imagenResId: Int
)
