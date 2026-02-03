package com.example.proyectopmdmtiendavideojuegos.view.page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.proyectopmdmtiendavideojuegos.R
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme
import com.example.proyectopmdmtiendavideojuegos.view.component.FieldText
import com.example.proyectopmdmtiendavideojuegos.view.component.Password
import com.example.proyectopmdmtiendavideojuegos.viewModel.vm.LoginPageVM

@Composable
fun Login(
    viewModel: LoginPageVM = viewModel(),
    onLoginSuccess: () -> Unit = {}
) {
    val uiState by viewModel.uiState.collectAsState()

    Box(
        modifier = Modifier
            .fillMaxSize()
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
                text = stringResource(id = R.string.loginpage_iniciar_sesion),
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Campos de usuario y contraseña
            FieldText(
                label = stringResource(R.string.loginpage_usuario),
                value = uiState.username,
                onValueChange = { viewModel.updateUsername(it) }
            )

            Spacer(modifier = Modifier.height(16.dp))

            Password(
                label = stringResource(R.string.loginpage_contrasena),
                value = uiState.password,
                onValueChange = { viewModel.updatePassword(it) }
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { viewModel.login() },
                modifier = Modifier.fillMaxWidth(),
                enabled = !uiState.isLoading
            ) {
                Text(
                    text = stringResource(id = R.string.loginpage_entrar),
                    fontWeight = FontWeight.Bold
                )
            }

            if (uiState.isLoading) {
                Spacer(modifier = Modifier.height(16.dp))
                CircularProgressIndicator()
            }

            uiState.errorMessage?.let { error ->
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = error, color = MaterialTheme.colorScheme.error)
            }
        }
    }

    // Llamamos al callback si login fue exitoso
    if (uiState.loginSuccess) {
        LaunchedEffect(Unit) {
            onLoginSuccess()
        }
    }
}

@Preview
@Composable
fun LoginPreviewLight() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = false) {
        Login()
    }
}

@Preview
@Composable
fun LoginPreviewDark() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = true) {
        Login()
    }
}
