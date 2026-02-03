package com.example.proyectopmdmtiendavideojuegos.viewModel.uistate

import com.example.proyectopmdmtiendavideojuegos.model.MyListItem

data class GenericListPageUIState(
    val title: String = "",
    val items: List<MyListItem> = emptyList(),
    val isLoading: Boolean = true
)
