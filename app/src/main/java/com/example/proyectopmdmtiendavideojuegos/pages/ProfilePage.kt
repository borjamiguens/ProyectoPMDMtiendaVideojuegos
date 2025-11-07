package com.example.proyectopmdmtiendavideojuegos.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import com.example.proyectopmdmtiendavideojuegos.myComponents.FieldText
import com.example.proyectopmdmtiendavideojuegos.myComponents.ProfileField
import com.example.proyectopmdmtiendavideojuegos.myComponents.ProfileFieldList
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme
import com.example.proyectopmdmtiendavideojuegos.R

//Vamos a instanciar una lista de campos de tipo ProfileFieldsList

//val listaCampos : ProfileFieldList

@Composable
fun ProfilePage() {

    val listaInicial = listOf(
        ProfileField("Nombre"),
        ProfileField("Apellidos"),
        ProfileField("Dirección"),
        ProfileField("Email"),
        ProfileField("Telefono"),
        ProfileField("Usuario"),
        ProfileField("Pass")
    )

    Box(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)

    ) {

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(24.dp),

            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {

            //Título de página
            Text(
                modifier = Modifier,
                text = "Perfil de usuario",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground,

                )
            Spacer(modifier = Modifier.height(12.dp))

            //Imagen de usuario y botón para abrir la cámara
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically

            ) {
                Box(
                    modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                ) {
                    //Imagen de usuario
                    Image(
                        painter = painterResource(id = R.drawable.juego_rdr2),
                        contentDescription = "txtTitle",
                        modifier = Modifier
                            .fillMaxWidth(0.4f),
                        contentScale = ContentScale.Fit
                    )
                }

                Spacer(modifier = Modifier.width(20.dp))

                //Botón de cámara
                Button(
                    modifier = Modifier
                        .width(90.dp)
                        .height(50.dp),
                    onClick = {}
                ) {
                    Icon(
                        modifier = Modifier
                            .fillMaxSize(),
                        imageVector = Icons.Filled.CameraAlt,
                        contentDescription = "Camara"
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            //Para cada elemento de nombre de la lista de campos de perfil de usuario
            //coloco un FieldTextComponent
            listaInicial.forEach { fieldData ->
                FieldText(fieldData.name)
                Spacer(modifier = Modifier.height(10.dp))
            }

            //Botón para introducir datos de usuario
            Button(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .height(50.dp),

                onClick = {}
            ) {
                Text(
                    "Validar",
                    modifier = Modifier,
                    color = MaterialTheme.colorScheme.onPrimary
                )
            }
        }
    }
}

//Preview para tema oscuro
@Preview
@Composable
fun ProfilePagePreview() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = true) {
        ProfilePage()
    }
}

//Preview para tema claro
@Preview
@Composable
fun ProfilePagePreview2() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = false) {
        ProfilePage()
    }
}