package com.example.proyectopmdmtiendavideojuegos.viewModel.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.proyectopmdmtiendavideojuegos.model.MyListItem
import com.example.proyectopmdmtiendavideojuegos.viewModel.uistate.GenericListPageUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class GenericListPageVM : ViewModel() {

    private val _uiState = MutableStateFlow(GenericListPageUIState())
    val uiState: StateFlow<GenericListPageUIState> = _uiState

    /**
     * Carga los items y el título de la página
     */
    fun loadItems(title: String, items: List<MyListItem>) {
        viewModelScope.launch {
            _uiState.value = GenericListPageUIState(isLoading = true)
            _uiState.value = GenericListPageUIState(
                title = title,
                items = items,
                isLoading = false
            )
        }
    }
}
