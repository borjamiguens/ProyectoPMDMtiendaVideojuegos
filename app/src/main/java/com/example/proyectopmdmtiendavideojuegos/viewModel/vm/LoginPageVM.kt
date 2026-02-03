package com.example.proyectopmdmtiendavideojuegos.viewModel.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.proyectopmdmtiendavideojuegos.viewModel.uistate.LoginPageUIState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class LoginPageVM : ViewModel() {

    private val _uiState = MutableStateFlow(LoginPageUIState())
    val uiState: StateFlow<LoginPageUIState> = _uiState

    fun updateUsername(username: String) {
        _uiState.value = _uiState.value.copy(username = username)
    }

    fun updatePassword(password: String) {
        _uiState.value = _uiState.value.copy(password = password)
    }

    fun login() {
        val username = _uiState.value.username
        val password = _uiState.value.password

        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, errorMessage = null)

            // Simulamos delay de login
            delay(1000)

            if (username == "admin" && password == "1234") {
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    loginSuccess = true
                )
            } else {
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    loginSuccess = false,
                    errorMessage = "Usuario o contraseña incorrectos"
                )
            }
        }
    }
}
