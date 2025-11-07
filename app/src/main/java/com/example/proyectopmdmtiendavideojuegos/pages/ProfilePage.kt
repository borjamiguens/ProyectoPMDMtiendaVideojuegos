package com.example.proyectopmdmtiendavideojuegos.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import com.example.proyectopmdmtiendavideojuegos.myComponents.FieldText
import com.example.proyectopmdmtiendavideojuegos.myComponents.Password
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme


@Composable
fun ProfilePage() {

    Box(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
    ) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier,
            text = "Perfil de usuario",
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Campos
        FieldText("nombre")
        Spacer(modifier = Modifier.height(16.dp))
        FieldText("apellidos")
        Spacer(modifier = Modifier.height(16.dp))
        FieldText("dirección")
        Spacer(modifier = Modifier.height(16.dp))
        FieldText("email")
        Spacer(modifier = Modifier.height(16.dp))
        FieldText("telefono")
        Spacer(modifier = Modifier.height(16.dp))
        FieldText("usuario")
        Spacer(modifier = Modifier.height(16.dp))
        FieldText("contraseña")


    }
}
}

@Preview(showBackground = true)
@Composable
fun ProfilePagePreview() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = true) {
        ProfilePage()
    }
}

@Preview(showBackground = false)
@Composable
fun ProfilePagePreview2() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = false) {
        ProfilePage()
    }
}