package com.example.proyectopmdmtiendavideojuegos.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import com.example.proyectopmdmtiendavideojuegos.myComponents.FieldText
import com.example.proyectopmdmtiendavideojuegos.myComponents.Password
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme


//Página para realizar el login
@Composable
fun Login() {

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
        //Título de la página
        Text(
            modifier = Modifier,
            text = "Iniciar sesión",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

        //Campo de usuario
        FieldText("Usuario")
        Spacer(modifier = Modifier.height(16.dp))

        //Campo de password
        Password("Pass")
        Spacer(modifier = Modifier.height(24.dp))

        //Botón para introducir credenciales
        Button(
            onClick = { },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Entrar",
                modifier = Modifier,
                fontWeight = FontWeight.Bold)
        }
    }
}
}

//Preview tema oscuro
@Preview
@Composable
fun LoginPreview() {
    ProyectoPMDMtiendaVideojuegosTheme (darkTheme = false) {
       Login()
    }
}

//Preview tema claro
@Preview
@Composable
fun LoginPreview2() {
    ProyectoPMDMtiendaVideojuegosTheme (darkTheme = true) {
        Login()
    }
}
