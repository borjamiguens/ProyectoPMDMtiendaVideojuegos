package com.example.proyectopmdmtiendavideojuegos.pages

import Search
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Category
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Login
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.VideogameAsset
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdmtiendavideojuegos.R
import com.example.proyectopmdmtiendavideojuegos.data.model.VideojuegoData.listaVideojuegos
import com.example.proyectopmdmtiendavideojuegos.myComponents.BottomBarButton
import com.example.proyectopmdmtiendavideojuegos.myComponents.ImageTextColumn
import com.example.proyectopmdmtiendavideojuegos.myComponents.Logo
import com.example.proyectopmdmtiendavideojuegos.myComponents.Title

@Composable
fun SelectorPage() {

    val verticalScrollState = rememberScrollState()
    val horizontalScrollStateJuegosDestacados = rememberScrollState()
    val horizontalScrollStateJuegosRecientes = rememberScrollState()
    val horizontalScrollStateJuegosAleatorios = rememberScrollState()

    data class ImageTextColumnData(
        val txtTitle: String,
        val txtCategoria: String,
        val txtConsola: String,
        val imagenResId: Int
    )

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
                    logo = R.drawable.a,
                    name = "NOMBRE",
                    modifier = Modifier
                ) { }

                Spacer(modifier = Modifier.width(15.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth(),
                ) {
                    Search(
                        modifier = Modifier
                            .height(40.dp)
                    ) { }
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
    ) { paddingValues ->

        val juegosDestacados = listaVideojuegos.take(6).map { juego ->
            ImageTextColumnData(
                txtTitle = juego.nombre,
                txtCategoria = juego.categoria.displayName,
                txtConsola = juego.consola.joinToString(", ") { it.displayName },
                imagenResId = juego.imagenResId
            )
        }.shuffled()

        val juegosRecientes = listaVideojuegos.take(6).map { juego ->
        ImageTextColumnData(
            txtTitle = juego.nombre,
            txtCategoria = juego.categoria.displayName,
            txtConsola = juego.consola.joinToString(", ") { it.displayName },
            imagenResId = juego.imagenResId
        )
        }.shuffled()

        val juegosAleatorios = listaVideojuegos.take(6).map { juego ->
            ImageTextColumnData(
                txtTitle = juego.nombre,
                txtCategoria = juego.categoria.displayName,
                txtConsola = juego.consola.joinToString(", ") { it.displayName },
                imagenResId = juego.imagenResId
            )
        }.shuffled()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF0d0d0d))
                .verticalScroll(verticalScrollState)
                .padding(paddingValues)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 25.dp),
                contentAlignment = Alignment.Center
            ) {
                Title(
                    name = "JUEGOS DESTACADOS",
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(horizontalScrollStateJuegosDestacados)
                    .padding(top = 15.dp, start = 15.dp)
            ) {
                juegosDestacados.forEach { item ->
                    ImageTextColumn(
                        txtTitle = item.txtTitle,
                        txtCategoria = item.txtCategoria,
                        txtConsola = item.txtConsola,
                        imagenResId = item.imagenResId,
                    ) { }
                    Spacer(modifier = Modifier.width(15.dp))
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 25.dp),
                contentAlignment = Alignment.Center
            ) {
                Title(
                    name = "JUEGOS RECIENTES",
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(horizontalScrollStateJuegosRecientes)
                    .padding(top = 15.dp, start = 15.dp)
            ) {
                juegosRecientes.forEach { item ->
                    ImageTextColumn(
                        txtTitle = item.txtTitle,
                        txtCategoria = item.txtCategoria,
                        txtConsola = item.txtConsola,
                        imagenResId = item.imagenResId,
                    ) { }
                    Spacer(modifier = Modifier.width(15.dp))
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 25.dp),
                contentAlignment = Alignment.Center
            ) {
                Title(
                    name = "JUEGOS ALEATORIOS",
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(horizontalScrollStateJuegosAleatorios)
                    .padding(top = 15.dp, start = 15.dp)
            ) {
                juegosAleatorios.forEach { item ->
                    ImageTextColumn(
                        txtTitle = item.txtTitle,
                        txtCategoria = item.txtCategoria,
                        txtConsola = item.txtConsola,
                        imagenResId = item.imagenResId,
                    ) { }
                    Spacer(modifier = Modifier.width(15.dp))
                }
            }
        }
    }
}

@Preview
@Composable
fun SelectorPagePreview() {
    SelectorPage()
}
