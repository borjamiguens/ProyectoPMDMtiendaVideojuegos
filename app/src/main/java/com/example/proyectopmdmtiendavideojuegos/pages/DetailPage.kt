package com.example.proyectopmdmtiendavideojuegos.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.size.Size
import com.example.proyectopmdmtiendavideojuegos.R
import com.example.proyectopmdmtiendavideojuegos.data.model.Consola
import com.example.proyectopmdmtiendavideojuegos.model.MyListItem
import com.example.proyectopmdmtiendavideojuegos.myComponents.GameImage
import com.example.proyectopmdmtiendavideojuegos.myComponents.RentButton
import com.example.proyectopmdmtiendavideojuegos.ui.theme.DarkSecondaryAccent
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme

@Composable
fun DetailPage(
    txtTitle: String,
    txtCategoria: String,
    txtDescripcion: String,
    consolas: List<Consola>,
    precio: Double,
    unidadesDisponibles: Int,
    imagenResId: Int,
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues = PaddingValues()
) {

    val verticalScrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(MaterialTheme.colorScheme.background)
            .padding(vertical = 25.dp)
            .verticalScroll(verticalScrollState)
    ) {

        // Imagen del juego
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 25.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(MaterialTheme.colorScheme.surfaceVariant)
                .padding(vertical = 10.dp),
            contentAlignment = Alignment.Center
        ) {
            GameImage(
                image = imagenResId,
                modifier = Modifier.size(275.dp)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Título del juego
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 25.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(MaterialTheme.colorScheme.surfaceVariant)
                .padding(vertical = 10.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = txtTitle,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface,
                textAlign = TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Precio del juego
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 25.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(MaterialTheme.colorScheme.tertiary)
                .padding(vertical = 10.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "$precio€",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onPrimary,
                textAlign = TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Detalles del juego
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 25.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(MaterialTheme.colorScheme.surfaceVariant)
                .padding(16.dp)
        ) {
            // Categoría
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // Título categoría
                Text(
                    text = stringResource(id = R.string.detailpage_categoria),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )

                // Categoría
                Text(
                    text = txtCategoria,
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f)
                )
            }

            // Consola
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // Título consola
                Text(
                    text = stringResource(id = R.string.detailpage_consola),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )

                // Listado de consolas
                Text(
                    text = consolas.joinToString("\n") { it.consoleName },
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f),
                    textAlign = TextAlign.End,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }

            // Unidades disponibles
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // Título unidades disponibles
                Text(
                    text = stringResource(id = R.string.detailpage_unidades_disponibles),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )

                // Unidades disponibles
                Text(
                    text = unidadesDisponibles.toString(),
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f)
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Descripción del juego
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 25.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(MaterialTheme.colorScheme.surfaceVariant)
                .padding(16.dp)
        ) {
            // Título descripción
            Text(
                text = stringResource(id = R.string.detailpage_descripcion),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Descripción
            Text(
                text = txtDescripcion,
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Botón alquilar
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 25.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(MaterialTheme.colorScheme.tertiary),
            contentAlignment = Alignment.Center
        ) {
            RentButton(text = stringResource(id = R.string.detailpage_descripcion)) { }
        }
    }
}

@Preview
@Composable
fun DetailPagePreview1() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = true) {
        val juego = com.example.proyectopmdmtiendavideojuegos.data.model.VideojuegoData.listaVideojuegos
            .first { it.id == 2 }

        DetailPage(
            txtTitle = juego.nombre,
            txtCategoria = juego.categoria.name,
            txtDescripcion = juego.descripcion,
            consolas = juego.consola,
            precio = juego.precio,
            unidadesDisponibles = juego.unidadesDisponibles,
            imagenResId = juego.imagenResId
        )
    }
}


@Preview
@Composable
fun DetailPagePreview2() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = false) {
        val juego =
            com.example.proyectopmdmtiendavideojuegos.data.model.VideojuegoData.listaVideojuegos
                .first { it.id == 7 }


        DetailPage(
            txtTitle = juego.nombre,
            txtCategoria = juego.categoria.name,
            txtDescripcion = juego.descripcion,
            consolas = juego.consola,
            precio = juego.precio,
            unidadesDisponibles = juego.unidadesDisponibles,
            imagenResId = juego.imagenResId
        )
    }
}