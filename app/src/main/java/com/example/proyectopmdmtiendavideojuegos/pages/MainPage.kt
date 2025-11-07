package com.example.proyectopmdmtiendavideojuegos.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdmtiendavideojuegos.data.model.VideojuegoData.listaVideojuegos
import com.example.proyectopmdmtiendavideojuegos.myComponents.ImageTextColumn
import com.example.proyectopmdmtiendavideojuegos.myComponents.Title
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme

@Composable
fun MainPage(modifier: Modifier = Modifier) {

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
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(verticalScrollState)
    ) {

        // JUEGOS DESTACADOS
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(MaterialTheme.colorScheme.surface)
                .padding(vertical = 20.dp)
        ) {
            Title(name = "JUEGOS DESTACADOS")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(horizontalScrollStateJuegosMasVendidos)
                    .padding(top = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                juegosDestacados.forEach { item ->
                    ImageTextColumn(
                        txtTitle = item.txtTitle,
                        txtCategoria = item.txtCategoria,
                        txtConsola = item.txtConsola,
                        imagenResId = item.imagenResId
                    ) { }
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // JUEGOS RECIENTES
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(MaterialTheme.colorScheme.surface)
                .padding(vertical = 20.dp)
        ) {
            Title(
                name = "JUEGOS RECIENTES",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(horizontalScrollStateJuegosRecientes)
                    .padding(top = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                juegosRecientes.forEach { item ->
                    ImageTextColumn(
                        txtTitle = item.txtTitle,
                        txtCategoria = item.txtCategoria,
                        txtConsola = item.txtConsola,
                        imagenResId = item.imagenResId
                    ) { }
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // JUEGOS ALEATORIOS
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(MaterialTheme.colorScheme.surface)
                .padding(vertical = 20.dp)
        ) {
            Title(
                name = "JUEGOS ALEATORIOS",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(horizontalScrollStateJuegosAleatorios)
                    .padding(top = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                juegosAleatorios.forEach { item ->
                    ImageTextColumn(
                        txtTitle = item.txtTitle,
                        txtCategoria = item.txtCategoria,
                        txtConsola = item.txtConsola,
                        imagenResId = item.imagenResId
                    ) { }
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
