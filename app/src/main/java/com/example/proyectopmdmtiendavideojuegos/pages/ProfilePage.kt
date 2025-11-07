package com.example.proyectopmdmtiendavideojuegos.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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

    val verticalScrollState = rememberScrollState()

    val listaInicial = listOf(
        ProfileField("nombre"),
        ProfileField("apellidos"),
        ProfileField("dirección"),
        ProfileField("eMail"),
        ProfileField("telefono"),
        ProfileField("usuario"),
        ProfileField("pass")
    )

    /*Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {*/


    Box(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)

    ) {

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(24.dp)
                .verticalScroll(state = verticalScrollState),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {

            Text(
                modifier = Modifier,
                text = "Perfil de usuario",
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.onBackground,

            )

            Row (
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically

            ){
                Image(
                    painter = painterResource(id = R.drawable.juego_rdr2),
                    contentDescription = "txtTitle",
                    modifier = Modifier
                        .fillMaxWidth(0.4f),
                    contentScale = ContentScale.Fit
                )

                Spacer(modifier = Modifier.width(20.dp))

                Button(

                    modifier = Modifier
                        .width(90.dp)
                        .height(50.dp),

                    onClick = {}
                ) {
                    /*Text("Validar",
                        modifier = Modifier,
                        color = MaterialTheme.colorScheme.onPrimary)*/
                    Icon(
                        /*painter = painterResource(R.drawable.camara),
                        contentDescription = ""*/
                        modifier = Modifier
                            .fillMaxSize(),
                        imageVector = Icons.Filled.CameraAlt,
                        contentDescription = "Camara"
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))


            //Para cada elemento de nombre de campo de la "tabla" perfil de usuario
            listaInicial.forEach { fieldData ->
                FieldText(fieldData.name)
                Spacer(modifier = Modifier.height(10.dp))

            }
            Button(

                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .height(50.dp),

                onClick = {}
            ) {
                Text("Validar",
                    modifier = Modifier,
                    color = MaterialTheme.colorScheme.onPrimary)
            }

        }
    }

    }
//}


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

@Preview
@Composable
fun ProfileFieldDataListPreview() {
    val fields = ArrayList<ProfileField>()
    fields.add(ProfileField("Paco"))
    fields.add(ProfileField("Luis"))
    ProfileFieldList(fields)
}