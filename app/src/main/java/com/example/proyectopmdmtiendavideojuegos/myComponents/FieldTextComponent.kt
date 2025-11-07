package com.example.proyectopmdmtiendavideojuegos.myComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme

@Composable
fun FieldText(
    label : String
) {
    Box(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(30.dp))

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                //.background(MaterialTheme.colorScheme.primary)
        ) {
            Text(
                modifier = Modifier
                    //.background(MaterialTheme.colorScheme.primary),
                ,text = "Introduce " + label + ":",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onPrimary
            )

            Spacer(modifier = Modifier.height(8.dp))

            TextField(
                modifier = Modifier.fillMaxWidth()
                    //.background(MaterialTheme.colorScheme.primary),
                ,value = "",
                onValueChange = {}, // sin funcionalidad
                label = { Text(label) },
                singleLine = true,
                shape = RoundedCornerShape(30.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FieldTextPreview() {
    ProyectoPMDMtiendaVideojuegosTheme (darkTheme = false) {
        FieldText("x")
    }
}

@Preview(showBackground = false)
@Composable
fun FieldTextPreview2() {
    ProyectoPMDMtiendaVideojuegosTheme (darkTheme = true) {
        FieldText("y",)
    }
}
