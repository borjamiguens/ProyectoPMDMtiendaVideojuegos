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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Category
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Login
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.VideogameAsset
import androidx.compose.material3.MaterialTheme
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
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme

@Composable
fun MainPage() {

    val verticalScrollState = rememberScrollState()
    val horizontalScrollStateJuegosMasVendidos = rememberScrollState()
    val horizontalScrollStateJuegosRecientes = rememberScrollState()
    val horizontalScrollStateJuegosAleatorios = rememberScrollState()

    data class ImageTextColumnData(
        val txtTitle: String,
        val txtCategoria: String,
        val txtConsola: String,
        val imagenResId: Int
    )

    val juegosDestacados = listaVideojuegos
        .sortedByDescending { it.numAlquilados }
        .take(8)
        .map { juego ->
            ImageTextColumnData(
                txtTitle = juego.nombre,
                txtCategoria = juego.categoria.categoryName,
                txtConsola = juego.consola.random().consoleName,
                imagenResId = juego.imagenResId
            )
        }

    val juegosRecientes = listaVideojuegos
        .takeLast(8)
        .reversed()
        .map { juego ->
            ImageTextColumnData(
                txtTitle = juego.nombre,
                txtCategoria = juego.categoria.categoryName,
                txtConsola = juego.consola.random().consoleName,
                imagenResId = juego.imagenResId
            )
        }


    val juegosAleatorios = listaVideojuegos
        .take(8)
        .map { juego ->
            ImageTextColumnData(
                txtTitle = juego.nombre,
                txtCategoria = juego.categoria.categoryName,
                txtConsola = juego.consola.random().consoleName,
                imagenResId = juego.imagenResId
            )
        }.shuffled()


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(verticalScrollState),
    ) {

        // JUEGOS DESTACADOS
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 25.dp)
        ) {

            Title(
                name = "JUEGOS DESTACADOS"
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(horizontalScrollStateJuegosMasVendidos)
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
        }

        // JUEGOS RECIENTES
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 25.dp)
        ) {
            Title(
                name = "JUEGOS RECIENTES",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

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
        }

        // JUEGOS ALEATORIOS
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 25.dp)
        ) {
            Title(
                name = "JUEGOS ALEATORIOS",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

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
fun MainPagePreview1() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = true) {
        MainPage()
    }
}

@Preview
@Composable
fun MainPagePreview2() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = false) {
        MainPage()
    }
}
