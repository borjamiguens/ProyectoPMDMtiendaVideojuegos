package com.example.proyectopmdmtiendavideojuegos.data.repository

import androidx.annotation.StringRes

data class ImageTextColumnData(
    val id: Int,
    val txtTitle: String,
    @StringRes val categoria: Int,
    val txtConsola: String,
    val imagenResId: Int
)
