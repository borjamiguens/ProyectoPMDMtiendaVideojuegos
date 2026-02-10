package com.example.proyectopmdmtiendavideojuegos.viewModel.uistate

import com.example.proyectopmdmtiendavideojuegos.data.data.ImageTextColumnData

data class MainPageUIState(
    val juegosDestacados: List<ImageTextColumnData> = emptyList(),
    val juegosRecientes: List<ImageTextColumnData> = emptyList(),
    val juegosAleatorios: List<ImageTextColumnData> = emptyList(),
    val isLoading: Boolean = true
)
