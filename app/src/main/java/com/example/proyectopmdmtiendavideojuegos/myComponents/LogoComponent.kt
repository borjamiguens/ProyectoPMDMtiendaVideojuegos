package com.example.proyectopmdmtiendavideojuegos.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectopmdmtiendavideojuegos.R

@Composable
fun Logo(
    logo: Int,
    name: String,
    modifier: Modifier = Modifier,
    action: () -> Unit
) {
    Row(
        modifier = modifier
            .clickable { action() }
            .padding(horizontal = 8.dp, vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = logo),
            contentDescription = name,
            modifier = Modifier
                .fillMaxHeight()
                .padding(end = 15.dp),
            contentScale = ContentScale.Fit
        )

        Text(
            text = name,
            color = Color.White,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Preview
@Composable
fun LogoPreview () {
    Logo(logo = R.drawable.a, name = "NOMBRE") { }

}