package com.example.proyectopmdmtiendavideojuegos.myComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdmtiendavideojuegos.R
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme

@Composable
fun Password(
    label : String
) {
    Row(
        modifier = Modifier
            .height(70.dp)
            .background(MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(30.dp)),
        verticalAlignment = Alignment.CenterVertically,

        ) {

        //Texto exterior
        Text(
            modifier = Modifier
                .padding(start = 25.dp)
                .fillMaxWidth(.22f)
            ,text = label,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onPrimary
        )

        Spacer(modifier = Modifier.width(8.dp))

        TextField(
            modifier = Modifier
                .fillMaxHeight(.70f)
                .fillMaxWidth()
                .padding(end = 10.dp)

            ,value = "",
            onValueChange = {}, // sin funcionalidad
            label = { Text(label) }, //texto interior
            singleLine = true,
            shape = RoundedCornerShape(30.dp),
            trailingIcon = {
                IconButton(onClick = {}) { // sin acción
                    Icon(
                        modifier = Modifier
                            .padding(end = 10.dp),
                        painter = painterResource(R.drawable.leer),
                        contentDescription = ""
                    )
                }
            }
        )
    }
}

//Preview tema claro
@Preview
@Composable
fun PasswordPreview() {
    ProyectoPMDMtiendaVideojuegosTheme (darkTheme = false){
        Password("Password")
    }
}

//Preview tema oscuro
@Preview
@Composable
fun PasswordPreview2() {
    ProyectoPMDMtiendaVideojuegosTheme (darkTheme = true){
        Password("Password")
    }
}

