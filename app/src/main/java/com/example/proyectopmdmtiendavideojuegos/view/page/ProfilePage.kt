package com.example.proyectopmdmtiendavideojuegos.view.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.proyectopmdmtiendavideojuegos.R
import com.example.proyectopmdmtiendavideojuegos.view.component.FieldText
import com.example.proyectopmdmtiendavideojuegos.viewModel.vm.ProfilePageVM

@Composable
fun ProfilePage(
    viewModel: ProfilePageVM = viewModel(),
    onCameraClick: () -> Unit = {}
) {
    val uiState by viewModel.uiState.collectAsState()

    if (uiState.isLoading) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text("Cargando perfil...")
        }
    } else {

        // Lista de labels y su valor correspondiente
        val fieldLabels = listOf(
            stringResource(R.string.profilepage_nombre) to uiState.nombre,
            stringResource(R.string.profilepage_apellidos) to uiState.apellidos,
            stringResource(R.string.profilepage_direccion) to uiState.direccion,
            stringResource(R.string.profilepage_email) to uiState.email,
            stringResource(R.string.profilepage_telefono) to uiState.telefono,
            stringResource(R.string.profilepage_usuario) to uiState.usuario,
            stringResource(R.string.profilepage_contrasena) to uiState.contrasena
        )

        Box(modifier = Modifier.background(MaterialTheme.colorScheme.background)) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                // Título
                item {
                    Text(
                        text = stringResource(R.string.profilepage_titulo),
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                }

                // Imagen y botón de cámara
                item {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(modifier = Modifier.clip(RoundedCornerShape(20.dp))) {
                            Image(
                                painter = painterResource(id = R.drawable.juego_red_dead_redemption_2),
                                contentDescription = "Foto de usuario",
                                modifier = Modifier.fillMaxWidth(0.4f),
                                contentScale = ContentScale.Fit
                            )
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Button(
                            modifier = Modifier.width(90.dp).height(50.dp),
                            onClick = { onCameraClick() }
                        ) {
                            Icon(
                                imageVector = Icons.Filled.CameraAlt,
                                contentDescription = "Cámara"
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                }

                // Campos de perfil
                items(fieldLabels) { (label, value) ->
                    val state = remember { mutableStateOf(value) }
                    FieldText(
                        label = label,
                        value = state.value,
                        onValueChange = { state.value = it }
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                }

                // Botón guardar
                item {
                    Spacer(modifier = Modifier.height(12.dp))
                    Button(
                        modifier = Modifier
                            .fillMaxWidth(0.5f)
                            .height(50.dp),
                        onClick = { }
                    ) {
                        Text(
                            text = stringResource(R.string.profilepage_validar),
                            color = MaterialTheme.colorScheme.onPrimary
                        )
                    }
                }
            }
        }
    }
}
