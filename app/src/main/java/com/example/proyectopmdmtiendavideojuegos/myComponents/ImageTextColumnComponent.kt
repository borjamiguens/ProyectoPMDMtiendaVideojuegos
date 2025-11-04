package com.example.proyectopmdmtiendavideojuegos.myComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.proyectopmdmtiendavideojuegos.R
import androidx.compose.ui.platform.LocalContext

@Composable
fun ImageTextColumn(
    txtTitle: String,
    txtCategoria: String,
    txtConsola: String,
    imagenResId: Int,
    modifier: Modifier = Modifier,
    action: () -> Unit
) {

    Column(
        modifier = modifier
            .clickable { action.invoke() }
    ) {

        Box(
            modifier = Modifier
                .height(150.dp)
                .aspectRatio(1f)
                .background(Color.Transparent),
        ) {

            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(imagenResId)
                    .crossfade(true)
                    .build(),
                contentDescription = txtTitle,
                modifier = Modifier
                    .clip(RoundedCornerShape(3.dp))
                    .fillMaxSize(),
                contentScale = ContentScale.Crop
            )

        }

        Column(
            modifier = Modifier
                .wrapContentHeight()
                .width(150.dp)
                .background(Color.Transparent)
                .padding(vertical = 12.dp),
        ) {

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = txtTitle,
                    fontSize = 13.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Clip,
                    lineHeight = 10.sp
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Box(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = txtCategoria,
                    fontSize = 12.sp,
                    color = Color.LightGray,
                    maxLines = 1,
                    overflow = TextOverflow.Clip,
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Box(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = txtConsola,
                    fontSize = 12.sp,
                    color = Color.LightGray,
                    maxLines = 1,
                    overflow = TextOverflow.Clip,
                )
            }

        }
    }
}

@Preview
@Composable
fun ImageTextColumnPreview() {
    ImageTextColumn(
        txtTitle = "Título del juego",
        txtCategoria = "Aventura",
        txtConsola = "Nintendo Switch",
        imagenResId = "https://upload.wikimedia.org/wikipedia/en/7/7d/The_Legend_of_Zelda_Tears_of_the_Kingdom_cover.jpg"
    ) { }
}
