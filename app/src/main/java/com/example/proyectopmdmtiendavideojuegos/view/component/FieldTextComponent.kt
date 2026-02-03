package com.example.proyectopmdmtiendavideojuegos.view.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme

@Composable
fun FieldText(
    label: String = "",
    value: String = "",
    onValueChange: (String) -> Unit = {}
) {
    Row(
        modifier = Modifier
            .height(70.dp)
            .background(
                MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(30.dp)
            ),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            modifier = Modifier
                .padding(start = 25.dp)
                .fillMaxWidth(0.27f),
            text = label,
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onPrimary
        )

        Spacer(modifier = Modifier.width(8.dp))

        TextField(
            modifier = Modifier
                .fillMaxHeight(0.7f)
                .fillMaxWidth()
                .padding(end = 10.dp),
            value = value,
            onValueChange = onValueChange,
            label = { Text(label) },
            singleLine = true,
            shape = RoundedCornerShape(30.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FieldTextPreview() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = false) {
        FieldText(
            label = "Usuario",
            value = "MiUsuario",
            onValueChange = {}
        )
    }
}

@Preview(showBackground = false)
@Composable
fun FieldTextPreview2() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = true) {
        FieldText(
            label = "Contraseña",
            value = "",
            onValueChange = {}
        )
    }
}
