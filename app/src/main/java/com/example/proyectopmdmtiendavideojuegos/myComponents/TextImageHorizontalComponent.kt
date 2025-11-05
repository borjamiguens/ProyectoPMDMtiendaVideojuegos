package com.example.proyectopmdmtiendavideojuegos.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectopmdmtiendavideojuegos.R
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme

@Composable
fun ImageTextRow(
    txtMsg: String,
    imageIdR: Int,
    modifier: Modifier = Modifier,
    action: () -> Unit
) {
    val cornerRadius = 4.dp

    Row(
        modifier = Modifier
            .height(100.dp)
            .then(modifier)
            .clickable { action.invoke() }
    ) {

        Box(
            modifier = Modifier
                .fillMaxHeight()
                .aspectRatio(1f)
                .clip(RoundedCornerShape(topStart = cornerRadius, bottomStart = cornerRadius))
        ) {
            Image(
                painter = painterResource(id = imageIdR),
                contentDescription = "",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }

        Box(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .clip(RoundedCornerShape(topEnd = cornerRadius, bottomEnd = cornerRadius))
                .background(MaterialTheme.colorScheme.background),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                text = txtMsg,
                modifier = Modifier.padding(start = 10.dp),
                fontSize = 20.sp,
                color = MaterialTheme.colorScheme.onBackground,
                fontWeight = FontWeight.Bold,
                maxLines = 1,
                overflow = TextOverflow.Clip
            )
        }
    }
}

@Preview
@Composable
fun ImageTextRowPreview () {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = true) {
        ImageTextRow(txtMsg = "TEXTO", R.drawable.juegordr2) { }
    }
}

@Preview
@Composable
fun ImageTextRowPreview2 () {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = false){
        ImageTextRow(txtMsg = "RDR 2",  R.drawable.juegordr2) { }
    }
}