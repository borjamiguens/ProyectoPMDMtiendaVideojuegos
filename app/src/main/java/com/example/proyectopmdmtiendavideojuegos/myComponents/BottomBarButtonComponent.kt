package com.example.proyectopmdmtiendavideojuegos.myComponents

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*

@Composable
fun BottomBarButton(
    icon: ImageVector,
    text: String,
    modifier: Modifier = Modifier,
    tint: Color = Color.White,
    action: () -> Unit
) {
    Column(
        modifier = modifier
            .clickable { action() }
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = text,
            tint = tint,
            modifier = Modifier
                .size(28.dp)
                .padding(bottom = 4.dp)
        )
        Text(
            text = text,
            color = tint,
            fontSize = 10.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Preview()
@Composable
fun BottomBarButtonPreviewA() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        BottomBarButton(Icons.Filled.Home, "Home") { }
        BottomBarButton(Icons.Filled.VideogameAsset, "Consolas") { }
        BottomBarButton(Icons.Filled.Category, "Categorías") { }
        BottomBarButton(Icons.Filled.Login, "Login") { }
        BottomBarButton(Icons.Filled.Person, "Perfil") { }
    }
}
