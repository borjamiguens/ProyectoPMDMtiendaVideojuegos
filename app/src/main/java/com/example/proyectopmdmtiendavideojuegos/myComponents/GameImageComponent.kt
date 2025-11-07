package com.example.proyectopmdmtiendavideojuegos.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdmtiendavideojuegos.R
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme

@Composable
fun GameImage(
    image: Int,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize()
                .clip(shape = RoundedCornerShape(4.dp))
                .border(
                    width = 4.dp,
                    color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.5f),
                    shape = RoundedCornerShape(4.dp)
                ),
            contentScale = ContentScale.Fit
        )
    }
}

@Preview
@Composable
fun ImagePreview1 () {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = false) {
        GameImage(image = R.drawable.imagen_prueba)
    }
}

@Preview
@Composable
fun ImagePreview2 () {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = true) {
        GameImage(image = R.drawable.imagen_prueba)
    }
}