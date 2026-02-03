package com.example.proyectopmdmtiendavideojuegos.viewModel.uistate

data class LoginPageUIState(
    val username: String = "",
    val password: String = "",
    val isLoading: Boolean = false,
    val loginSuccess: Boolean = false,
    val errorMessage: String? = null
)