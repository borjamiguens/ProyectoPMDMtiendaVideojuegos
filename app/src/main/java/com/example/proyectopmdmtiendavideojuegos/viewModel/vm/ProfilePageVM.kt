package com.example.proyectopmdmtiendavideojuegos.viewModel.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.proyectopmdmtiendavideojuegos.viewModel.uistate.ProfilePageUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ProfilePageVM : ViewModel() {

    private val _uiState = MutableStateFlow(ProfilePageUIState())
    val uiState: StateFlow<ProfilePageUIState> = _uiState

    init {
        loadProfile()
    }

    fun loadProfile() {
        viewModelScope.launch {
            _uiState.value = ProfilePageUIState(isLoading = true)

            // Aquí normalmente cargarías el usuario desde repositorio o SharedPreferences
            // Simulación:
            _uiState.value = ProfilePageUIState(
                nombre = "Juan",
                apellidos = "Pérez",
                direccion = "Calle Falsa 123",
                email = "juan.perez@mail.com",
                telefono = "123456789",
                usuario = "juanp",
                contrasena = "********",
                isLoading = false
            )
        }
    }

    fun updateProfile(data: Map<String, String>) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                nombre = data["Nombre"] ?: _uiState.value.nombre,
                apellidos = data["Apellidos"] ?: _uiState.value.apellidos,
                direccion = data["Dirección"] ?: _uiState.value.direccion,
                email = data["Email"] ?: _uiState.value.email,
                telefono = data["Teléfono"] ?: _uiState.value.telefono,
                usuario = data["Usuario"] ?: _uiState.value.usuario,
                contrasena = data["Contraseña"] ?: _uiState.value.contrasena
            )
        }
    }
}
