package com.example.proyectopmdmtiendavideojuegos.pages

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.proyectopmdmtiendavideojuegos.data.data.VideojuegoData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DetailPageVM : ViewModel() {

    private val _uiState = MutableStateFlow(DetailPageUIState())
    val uiState: StateFlow<DetailPageUIState> = _uiState

    fun loadJuego(juegoId: Int) {
        viewModelScope.launch {
            _uiState.value = DetailPageUIState(isLoading = true)
            val juego = VideojuegoData.listaVideojuegos.firstOrNull { it.id == juegoId }
            if (juego != null) {
                _uiState.value = DetailPageUIState(
                    txtTitle = juego.nombre,
                    txtCategoria = juego.categoria.name,
                    txtDescripcion = juego.descripcion,
                    consolas = juego.consola,
                    precio = juego.precio,
                    unidadesDisponibles = juego.unidadesDisponibles,
                    imagenResId = juego.imagenResId,
                    isLoading = false
                )
            } else {
                _uiState.value = DetailPageUIState(isLoading = false)
            }
        }
    }
}
