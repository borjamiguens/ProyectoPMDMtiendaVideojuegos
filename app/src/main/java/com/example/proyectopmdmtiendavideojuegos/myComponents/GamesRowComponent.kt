package com.example.proyectopmdmtiendavideojuegos.myComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdmtiendavideojuegos.data.model.ImageTextColumnData
import com.example.proyectopmdmtiendavideojuegos.data.model.VideojuegoData.listaVideojuegos
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme


@Composable
fun GamesRow(
    title: String,
    gameList: List<ImageTextColumnData>
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(MaterialTheme.colorScheme.surface)
            .padding(vertical = 20.dp)
    ) {
        // Título
        Title(name = title)

        // Listado de videojuegos
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            items(gameList) { item ->
                ImageTextColumn(
                    txtTitle = item.txtTitle,
                    txtCategoriaResId = item.categoria,
                    txtConsola = item.txtConsola,
                    imagenResId = item.imagenResId,
                    action = { }
                )
            }
        }
    }
}

@Preview
@Composable
fun GamesRowPreview1() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = true) {
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

        GamesRow(title = "hola", gameList = juegosDestacados)
    }
}

@Preview
@Composable
fun GamesRowPreview2() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = false) {
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

        GamesRow(title = "hola", gameList = juegosDestacados)
    }
}

