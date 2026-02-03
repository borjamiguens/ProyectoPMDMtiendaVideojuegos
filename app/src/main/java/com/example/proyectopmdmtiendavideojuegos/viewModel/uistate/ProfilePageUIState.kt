package com.example.proyectopmdmtiendavideojuegos.viewModel.uistate

data class ProfilePageUIState(
    val nombre: String = "",
    val apellidos: String = "",
    val direccion: String = "",
    val email: String = "",
    val telefono: String = "",
    val usuario: String = "",
    val contrasena: String = "",
    val isLoading: Boolean = true
)
