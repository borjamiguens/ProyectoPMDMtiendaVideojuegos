package com.example.proyectopmdmtiendavideojuegos.viewModel.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.proyectopmdmtiendavideojuegos.data.repository.ImageTextColumnData
import com.example.proyectopmdmtiendavideojuegos.data.repository.VideojuegoData
import com.example.proyectopmdmtiendavideojuegos.viewModel.uistate.MainPageUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainPageVM : ViewModel() {

    private val _uiState = MutableStateFlow(MainPageUIState())
    val uiState: StateFlow<MainPageUIState> = _uiState

    fun loadJuegos() {
        viewModelScope.launch {
            _uiState.value = MainPageUIState(isLoading = true)

            val lista = VideojuegoData.listaVideojuegos

            val destacados = lista
                .sortedByDescending { it.numAlquilados }
                .take(8)
                .map { juego -> juego.toImageTextColumnData() }

            val recientes = lista
                .takeLast(8)
                .reversed()
                .map { juego -> juego.toImageTextColumnData() }

            val aleatorios = lista
                .take(8)
                .map { juego -> juego.toImageTextColumnData() }
                .shuffled()

            _uiState.value = MainPageUIState(
                juegosDestacados = destacados,
                juegosRecientes = recientes,
                juegosAleatorios = aleatorios,
                isLoading = false
            )
        }
    }

    // Extensión para mapear Videojuego -> ImageTextColumnData
    private fun com.example.proyectopmdmtiendavideojuegos.model.Videojuego.toImageTextColumnData(): ImageTextColumnData {
        return ImageTextColumnData(
            id = this.id,
            txtTitle = this.nombre,
            categoria = this.categoria.nameResId,
            txtConsola = this.consola.random().consoleName,
            imagenResId = this.imagenResId
        )
    }
}
