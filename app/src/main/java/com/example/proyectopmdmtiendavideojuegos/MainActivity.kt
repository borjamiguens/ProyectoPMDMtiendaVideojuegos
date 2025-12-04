package com.example.proyectopmdmtiendavideojuegos

import Search
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdmtiendavideojuegos.myComponents.BottomBarButton
import com.example.proyectopmdmtiendavideojuegos.myComponents.Logo
import com.example.proyectopmdmtiendavideojuegos.pages.DetailPage
import com.example.proyectopmdmtiendavideojuegos.pages.MainPage
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme
import kotlin.collections.first

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoPMDMtiendaVideojuegosTheme(darkTheme = true) {
                Scaffold(
                    containerColor = Color(0xFF0d0d0d),
                    topBar = {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFF0d0d0d))
                                .padding(top = 15.dp, start = 15.dp, end = 15.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Logo(
                                logo = R.drawable.imagen_prueba,
                                name = "NOMBRE",
                                modifier = Modifier
                            ) { }

                            Spacer(modifier = Modifier.width(15.dp))

                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Search(modifier = Modifier.height(40.dp)) { }
                            }
                        }
                    },
                    bottomBar = {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFF0d0d0d))
                                .padding(vertical = 10.dp),
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            BottomBarButton(Icons.Filled.Home, "HOME") { }
                            BottomBarButton(Icons.Filled.VideogameAsset, "CONSOLAS") { }
                            BottomBarButton(Icons.Filled.Category, "CATEGORIAS") { }
                            BottomBarButton(Icons.Filled.Login, "LOGIN") { }
                            BottomBarButton(Icons.Filled.Person, "PERFIL") { }
                        }
                    }
                ) { innerPadding ->
                    val juego = com.example.proyectopmdmtiendavideojuegos.data.model.VideojuegoData.listaVideojuegos
                        .first { it.id == 2 }

                    DetailPage(
                        txtTitle = juego.nombre,
                        txtCategoria = stringResource(juego.categoria.nameResId),
                        txtDescripcion = juego.descripcion,
                        consolas = juego.consola,
                        precio = juego.precio,
                        unidadesDisponibles = juego.unidadesDisponibles,
                        imagenResId = juego.imagenResId,
                        modifier = Modifier,
                        paddingValues = innerPadding
                    )
                }
            }
        }
    }
}