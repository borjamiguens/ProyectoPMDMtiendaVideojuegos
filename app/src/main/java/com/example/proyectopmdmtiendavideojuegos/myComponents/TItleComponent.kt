package com.example.proyectopmdmtiendavideojuegos.myComponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Title(
    name: String,
    modifier: Modifier = Modifier,
    fontSize: TextUnit = 24.sp
) {
    Box {
        Text(
            text = name,
            color = Color.Black.copy(alpha = 0.2f),
            fontWeight = FontWeight.Bold,
            fontSize = fontSize,
            modifier = Modifier
                .fillMaxWidth()
                .offset(x = 2.dp, y = 2.dp),
            textAlign = TextAlign.Center
        )

        Text(
            text = name,
            color = Color.Black.copy(alpha = 0.4f),
            fontWeight = FontWeight.Bold,
            fontSize = fontSize,
            modifier = Modifier
                .fillMaxWidth()
                .offset(x = 1.dp, y = 1.dp),
            textAlign = TextAlign.Center
        )

        Text(
            text = name,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = fontSize,
            modifier = modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center

        )
    }

}

@Preview
@Composable
fun TextImagePreview () {
    Title(name = "JUEGOS DESTACADOS")
}

