package com.example.proyectopmdmtiendavideojuegos.myComponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


/*@Composable
fun ProfileFieldsList(items: FieldTextComponent<FieldTextComponent>) {
    LazyColumn {
        items(items) { item ->
            Text(text = item)
        }
    }
}*/

//private val String.name: String

class ProfileField(var name: String) {//aqui estoy declarando la clase
    //al poner var, los parametros del constructor se convierten en propiedades de la clase
    //es decir, no necesito escribir un constructor aparte ni declara las variables dentro
}

@Composable

fun ProfileFieldList(fields: List<ProfileField>) {

    //val listaInicial = listOf(ProfileField("nombre"),ProfileField("apellidos"))
    /*Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        fields.forEach { fieldData ->
           FieldText(fieldData.name)

        }
    }*/
}

@Preview
@Composable
fun ProfileFieldDataListPreview() {
    val fields = ArrayList<ProfileField>()
    fields.add(ProfileField("Paco"))
    fields.add(ProfileField("Luis"))


    ProfileFieldList(fields)
}