package com.example.proyectopmdmtiendavideojuegos.view.page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdmtiendavideojuegos.data.repository.ImageTextColumnData
import com.example.proyectopmdmtiendavideojuegos.data.repository.VideojuegoData.listaVideojuegos
import com.example.proyectopmdmtiendavideojuegos.view.component.GamesRow
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme

/**
 * MainPage ahora recibe un callback `onJuegoClick` que se dispara
 * cuando se pulsa un juego y envía el id del juego.
 */
@Composable
fun MainPage(
    modifier: Modifier = Modifier,
    onJuegoClick: (Int) -> Unit  // callback agregado
) {

    // Juegos destacados
    val juegosDestacados = listaVideojuegos
        .sortedByDescending { it.numAlquilados }
        .take(8)
        .map { juego ->
            ImageTextColumnData(
                id = juego.id,  // <-- agregado
                txtTitle = juego.nombre,
                categoria = juego.categoria.nameResId,
                txtConsola = juego.consola.random().consoleName,
                imagenResId = juego.imagenResId
            )
        }

    // Juegos recientes
    val juegosRecientes = listaVideojuegos
        .takeLast(8)
        .reversed()
        .map { juego ->
            ImageTextColumnData(
                id = juego.id,
                txtTitle = juego.nombre,
                categoria = juego.categoria.nameResId,
                txtConsola = juego.consola.random().consoleName,
                imagenResId = juego.imagenResId
            )
        }

    // Juegos aleatorios
    val juegosAleatorios = listaVideojuegos
        .take(8)
        .map { juego ->
            ImageTextColumnData(
                id = juego.id,
                txtTitle = juego.nombre,
                categoria = juego.categoria.nameResId,
                txtConsola = juego.consola.random().consoleName,
                imagenResId = juego.imagenResId
            )
        }.shuffled()

    // Lista principal
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {

        item {
            GamesRow(
                title = "JUEGOS DESTACADOS",
                gameList = juegosDestacados,
                onGameClick = { id -> onJuegoClick(id) }  // callback
            )
        }

        item {
            GamesRow(
                title = "JUEGOS RECIENTES",
                gameList = juegosRecientes,
                onGameClick = { id -> onJuegoClick(id) }
            )
        }

        item {
            GamesRow(
                title = "JUEGOS ALEATORIOS",
                gameList = juegosAleatorios,
                onGameClick = { id -> onJuegoClick(id) }
            )
        }
    }
}

@Preview
@Composable
fun MainPagePreview1() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = true) {
        MainPage(onJuegoClick = {}) // Preview con callback vacío
    }
}

@Preview
@Composable
fun MainPagePreview2() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = false) {
        MainPage(onJuegoClick = {})
    }
}
