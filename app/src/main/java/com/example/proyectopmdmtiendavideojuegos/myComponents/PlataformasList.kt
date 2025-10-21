package com.example.proyectopmdmtiendavideojuegos.myComponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


class PlataformaData(var name: String)

@Composable
fun PlataformasList(names: List<PlataformaData>) {
    Column (modifier = Modifier) {
            names.forEach { plataformaData ->
            PlataformaData(plataformaData.name)
        }
    }
}

@Preview
@Composable
fun PlataformasListPreview() {
    val plataformas = ArrayList<PlataformaData>()
    plataformas.add(PlataformaData("PS2"))
    plataformas.add(PlataformaData("PS3"))
    plataformas.add(PlataformaData("PS4"))


    PlataformasList(plataformas)
}