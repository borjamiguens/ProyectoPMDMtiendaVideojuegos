package com.example.proyectopmdmtiendavideojuegos.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectopmdmtiendavideojuegos.R
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme

@Composable
fun ImageTextColumn(
    txtTitle: String,
    txtCategoria: String,
    txtConsola: String,
    imagenResId: Int,
    modifier: Modifier = Modifier,
    action: () -> Unit
) {
    Column(
        modifier = modifier
            .width(150.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(MaterialTheme.colorScheme.surfaceVariant)
            .border(
                width = 2.dp,
                color = MaterialTheme.colorScheme.outline.copy(alpha = 0.6f),
                shape = RoundedCornerShape(12.dp)
            )
            .clickable { action.invoke() }
    ) {

        // Primer bloque
        Box(
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
        ) {

            // Imagen
            Image(
                painter = painterResource(id = imagenResId),
                contentDescription = txtTitle,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }

        // Segundo bloque
        Column(
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .padding(vertical = 12.dp, horizontal = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Título del videojuego
            Text(
                text = txtTitle,
                fontSize = 13.sp,
                color = MaterialTheme.colorScheme.onSurface,
                fontWeight = FontWeight.Bold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                lineHeight = 14.sp
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Categoría
            Text(
                text = txtCategoria,
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f),
                fontWeight = FontWeight.Medium,
                maxLines = 1,
                overflow = TextOverflow.Clip
            )

            Spacer(modifier = Modifier.height(6.dp))

            // Consola
            Text(
                text = txtConsola,
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f),
                fontWeight = FontWeight.Medium,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Preview
@Composable
fun ImageTextColumnPreviewDark() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = true) {
        ImageTextColumn(
            txtTitle = "The Legend of Zelda",
            txtCategoria = "Aventura",
            txtConsola = "Nintendo Switch",
            imagenResId = R.drawable.juego_fortnite
        ) { }
    }
}

@Preview
@Composable
fun ImageTextColumnPreviewLight() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = false) {
        ImageTextColumn(
            txtTitle = "The Legend of Zelda",
            txtCategoria = "Aventura",
            txtConsola = "Nintendo Switch",
            imagenResId = R.drawable.juego_fortnite
        ) { }
    }
}
