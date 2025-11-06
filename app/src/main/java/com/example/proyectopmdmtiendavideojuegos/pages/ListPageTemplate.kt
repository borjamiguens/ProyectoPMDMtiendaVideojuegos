package com.example.proyectopmdmtiendavideojuegos.pages

import Search
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdmtiendavideojuegos.R
import com.example.proyectopmdmtiendavideojuegos.data.model.VideojuegoData.listaVideojuegos
import com.example.proyectopmdmtiendavideojuegos.model.MyListItem
import com.example.proyectopmdmtiendavideojuegos.myComponents.*

@Composable
fun GenericListPage(
    title: String,
    items: List<MyListItem>,
    onItemClick: (MyListItem) -> Unit = {}
) {

    val verticalScrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0d0d0d))
            .verticalScroll(verticalScrollState),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))

        Title(name = title)

        Spacer(modifier = Modifier.height(25.dp))

        items.forEach { item ->
            ImageTextRow(
                txtMsg = item.name,
                imageIdR = item.imageResId,
                modifier = Modifier
                    .height(80.dp)
                    .width(300.dp)
            ) {
                onItemClick(item)
            }

            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}



@Preview()
@Composable
fun GenericListPagePreview() {

    val juegosAleatorios = listaVideojuegos
        .take(8)
        .map { juego ->
            MyListItem(
                name = juego.nombre,
                imageResId = juego.imagenResId
            )
        }.shuffled()

    GenericListPage(
        title = "JUEGOS ALEATORIOS",
        items = juegosAleatorios
    ) { }
}