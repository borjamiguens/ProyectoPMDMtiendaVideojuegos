package com.example.proyectopmdmtiendavideojuegos.myComponents

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun TitleText(
    name: String,
    modifier: Modifier = Modifier,
    fontSize: TextUnit = 24.sp
) {
    Text(
        text = buildAnnotatedString { append(name) },
        modifier = modifier,
        color = Color.White,
        fontWeight = FontWeight.Bold,
        fontSize = fontSize
    )
}

@Preview
@Composable
fun TextImagePreview () {
    TitleText(name = "JUEGOS DESTACADOS")
}

