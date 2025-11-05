package com.example.proyectopmdmtiendavideojuegos.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectopmdmtiendavideojuegos.R
import androidx.compose.ui.res.painterResource

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
            .clip(shape = RoundedCornerShape(12.dp))
            .background(Color(0xFF1F1F1F))
            .border(
                width = 1.dp,
                color = Color.White.copy(alpha = 0.1f),
                shape = RoundedCornerShape(12.dp)
            )
            .clickable { action.invoke() }
    ) {

        Box(
            modifier = Modifier
                .height(150.dp)
                .aspectRatio(1f)
        ) {

            Image(
                painter = painterResource(id = imagenResId),
                contentDescription = txtTitle,
                modifier = Modifier
                    .fillMaxSize(),
                contentScale = ContentScale.Crop
            )

        }

        Column(
            modifier = Modifier
                .wrapContentHeight()
                .width(150.dp)
                .padding(vertical = 12.dp),
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 5.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = txtTitle,
                    fontSize = 13.sp,
                    color = Color.Black.copy(alpha = 0.6f),
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    lineHeight = 10.sp,
                    modifier = Modifier.offset(x = 1.dp, y = 2.dp)
                )


                Text(
                    text = txtTitle,
                    fontSize = 13.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    lineHeight = 10.sp
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 5.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = txtCategoria,
                    fontSize = 12.sp,
                    color = Color.LightGray,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Clip
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 5.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = txtConsola,
                    fontSize = 12.sp,
                    color = Color.LightGray,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
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
        imagenResId = R.drawable.juego_fortnite
    ) { }
}
