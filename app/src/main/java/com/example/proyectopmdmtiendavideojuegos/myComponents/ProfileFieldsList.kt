package com.example.proyectopmdmtiendavideojuegos.myComponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class ProfileField(var name: String) {//aqui estoy declarando la clase
    //al poner var, los parametros del constructor se convierten en propiedades de la clase
    //es decir, no necesito escribir un constructor aparte ni declara las variables dentro
}

@Composable
fun ProfileFieldList(fields: List<ProfileField>) {
}

@Preview
@Composable
fun ProfileFieldDataListPreview() {
}