package com.example.proyectopmdmtiendavideojuegos.myComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme

@Composable
fun FieldText(
    label : String
) {
    Row(
        modifier = Modifier
            .height(70.dp)
            .background(MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(30.dp)),
        verticalAlignment = Alignment.CenterVertically,

    ) {
        /*Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                //.background(MaterialTheme.colorScheme.primary)
        ) {*/
            Text(
                modifier = Modifier
                    .padding(start = 25.dp)
                    .fillMaxWidth(.22f)
                    //.background(MaterialTheme.colorScheme.primary),
                ,text = label,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onPrimary
            )

            Spacer(modifier = Modifier.width(8.dp))

            TextField(
                modifier = Modifier
                    .fillMaxHeight(.70f)
                    .fillMaxWidth()
                    .padding(end = 10.dp)
                    //.background(MaterialTheme.colorScheme.primary),
                ,value = "",
                onValueChange = {}, // sin funcionalidad
                label = { Text(label) },
                singleLine = true,
                shape = RoundedCornerShape(30.dp)
            )
        }
    }
//}

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
