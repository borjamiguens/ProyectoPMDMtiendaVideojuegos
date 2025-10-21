package com.example.proyectopmdmtiendavideojuegos.myComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TextTextfile(name: String) {

    val backGroundColor =  Color.White

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(backGroundColor)
            .border(width = 0.5.dp, color = Color.LightGray)
            .padding(all = 4.dp)
    ) {
        Text(text = name, modifier = Modifier.fillMaxWidth())
    }

}

@Preview
@Composable
fun TextTextfilePreview() {
    TextTextfile(name = "Indica tu nombre" )
}
