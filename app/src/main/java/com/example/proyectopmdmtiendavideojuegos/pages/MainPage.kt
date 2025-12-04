package com.example.proyectopmdmtiendavideojuegos.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdmtiendavideojuegos.data.model.ImageTextColumnData
import com.example.proyectopmdmtiendavideojuegos.data.model.VideojuegoData.listaVideojuegos
import com.example.proyectopmdmtiendavideojuegos.myComponents.GamesRow
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme

@Composable
fun MainPage(modifier: Modifier = Modifier) {

    // Selección de videojuegos
    val juegosDestacados = listaVideojuegos
        .sortedByDescending { it.numAlquilados }
        .take(8)
        .map { juego ->
            ImageTextColumnData(
                txtTitle = juego.nombre,
                categoria = juego.categoria.nameResId,
                txtConsola = juego.consola.random().consoleName,
                imagenResId = juego.imagenResId,
            )
        }

    // Selección de videojuegos
    val juegosRecientes = listaVideojuegos
        .takeLast(8)
        .reversed()
        .map { juego ->
            ImageTextColumnData(
                txtTitle = juego.nombre,
                categoria = juego.categoria.nameResId,
                txtConsola = juego.consola.random().consoleName,
                imagenResId = juego.imagenResId
            )
        }

    // Selección de videojuegos
    val juegosAleatorios = listaVideojuegos
        .take(8)
        .map { juego ->
            ImageTextColumnData(
                txtTitle = juego.nombre,
                categoria = juego.categoria.nameResId,
                txtConsola = juego.consola.random().consoleName,
                imagenResId = juego.imagenResId
            )
        }.shuffled()

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {

        item {
            GamesRow(title = "JUEGOS DESTACADOS", gameList = juegosDestacados)
        }

        item {
            GamesRow(title = "JUEGOS RECIENTES", gameList = juegosRecientes)
        }

        item {
            GamesRow(title = "JUEGOS ALEATORIOS", gameList = juegosAleatorios)
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
