package com.example.proyectopmdmtiendavideojuegos.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
fun Login() {
    //val username
    //val passwordname
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
                text = "Iniciar sesión",
                style = MaterialTheme.typography.headlineMedium
            )

            Spacer(modifier = Modifier.height(24.dp))

        // Campo de usuario
        FieldText("Usuario")
        Spacer(modifier = Modifier.height(16.dp))

            // Campo de contraseña
            Password()
            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Entrar")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview1() {
    ProyectoPMDMtiendaVideojuegosTheme (darkTheme = false) {
       Login()
    }
}

@Preview(showBackground = false)
@Composable
fun LoginPreview2() {
    ProyectoPMDMtiendaVideojuegosTheme (darkTheme = true) {
        Login()
    }
}
