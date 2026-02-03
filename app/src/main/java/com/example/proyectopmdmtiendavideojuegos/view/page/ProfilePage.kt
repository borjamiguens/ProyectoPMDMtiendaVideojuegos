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
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.example.proyectopmdmtiendavideojuegos.view.component.FieldText
import com.example.proyectopmdmtiendavideojuegos.view.component.ProfileField
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme
import com.example.proyectopmdmtiendavideojuegos.R

@Composable
fun ProfilePage(
    onProfileUpdateClick: (Map<String, String>) -> Unit = {},
    onCameraClick: () -> Unit = {}
) {

    // Primero obtenemos los textos con stringResource (directamente dentro de @Composable)
    val nombreText = stringResource(id = R.string.profilepage_nombre)
    val apellidosText = stringResource(id = R.string.profilepage_apellidos)
    val direccionText = stringResource(id = R.string.profilepage_direccion)
    val emailText = stringResource(id = R.string.profilepage_email)
    val telefonoText = stringResource(id = R.string.profilepage_telefono)
    val usuarioText = stringResource(id = R.string.profilepage_usuario)
    val contrasenaText = stringResource(id = R.string.profilepage_contrasena)
    val tituloText = stringResource(id = R.string.profilepage_titulo)
    val validarText = stringResource(id = R.string.profilepage_validar)

    // Lista de campos con estado editable
    val listaInicial = remember {
        listOf(
            ProfileField(name = nombreText),
            ProfileField(name = apellidosText),
            ProfileField(name = direccionText),
            ProfileField(name = emailText),
            ProfileField(name = telefonoText),
            ProfileField(name = usuarioText),
            ProfileField(name = contrasenaText)
        ).map { field ->
            field to mutableStateOf("") // estado editable por campo
        }
    }

    Box(
        modifier = Modifier.background(MaterialTheme.colorScheme.background)
    ) {

        LazyColumn(
            modifier = Modifier
                .fillMaxHeight()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // Título
            item {
                Text(
                    text = tituloText,
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
                        modifier = Modifier
                            .width(90.dp)
                            .height(50.dp),
                        onClick = { onCameraClick() }
                    ) {
                        Icon(
                            modifier = Modifier.fillMaxSize(),
                            imageVector = Icons.Filled.CameraAlt,
                            contentDescription = "Cámara"
                        )
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))
            }

            // Campos de perfil
            items(listaInicial) { (field, state) ->
                FieldText(
                    label = field.name,
                    value = state.value,
                    onValueChange = { state.value = it }
                )
                Spacer(modifier = Modifier.height(10.dp))
            }

            // Botón validar
            item {
                Spacer(modifier = Modifier.height(12.dp))

                Button(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .height(50.dp),
                    onClick = {
                        val result = listaInicial.associate {
                            it.first.name to it.second.value
                        }
                        onProfileUpdateClick(result)
                    }
                ) {
                    Text(
                        text = validarText,
                        color = MaterialTheme.colorScheme.onPrimary
                    )
                }
            }
        }
    }
}

// Preview tema oscuro
@Preview
@Composable
fun ProfilePagePreview() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = true) {
        ProfilePage()
    }
}

// Preview tema claro
@Preview
@Composable
fun ProfilePagePreview2() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = false) {
        ProfilePage()
    }
}
