package com.example.proyectopmdmtiendavideojuegos.view.page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.example.proyectopmdmtiendavideojuegos.view.component.FieldText
import com.example.proyectopmdmtiendavideojuegos.view.component.Password
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme
import com.example.proyectopmdmtiendavideojuegos.R

/**
 * Página de Login ahora recibe un callback `onLoginClick`
 * que se dispara cuando el usuario pulsa el botón Entrar.
 */
@Composable
fun Login(
    onLoginClick: (String, String) -> Unit = { _, _ -> }
) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

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
            // Título de la página
            Text(
                text = stringResource(id = R.string.loginpage_iniciar_sesion),
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Campo de usuario
            FieldText(
                label = stringResource(R.string.loginpage_usuario),
                value = username,
                onValueChange = { username = it }
            )
            Spacer(modifier = Modifier.height(16.dp))

            // Campo de password
            Password(
                label = stringResource(id = R.string.loginpage_contrasena),
                value = password,
                onValueChange = { password = it }
            )
            Spacer(modifier = Modifier.height(24.dp))

            // Botón para introducir credenciales
            Button(
                onClick = { onLoginClick(username, password) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = stringResource(id = R.string.loginpage_entrar),
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

// Preview tema oscuro
@Preview
@Composable
fun LoginPreview() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = false) {
        Login()
    }
}

// Preview tema claro
@Preview
@Composable
fun LoginPreview2() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = true) {
        Login()
    }
}
