package com.example.proyectopmdmtiendavideojuegos.myComponents

import android.media.Image
import android.os.Message
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
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

@Composable
fun ImageTextColumn (
    txtTitle: String,
    txtCategoria: String,
    txtConsola: String,
    imageIdR: Int,
    modifier: Modifier = Modifier,
    action: () -> Unit
){

    Column(
        modifier = Modifier
            .clickable { action.invoke() }) {

        Box(
            modifier = Modifier.Companion
                .height(height = 150.dp)
                .aspectRatio(1f)
                .background(color = Color.Companion.Transparent),
        ) {

            androidx.compose.foundation.Image(
                painter = painterResource(id = imageIdR),
                contentDescription = "",
                modifier = Modifier.Companion
                    .clip(RoundedCornerShape(3.dp))
                    .fillMaxSize(),
                contentScale = ContentScale.Companion.Crop
            )

        }
        Column(
            modifier = Modifier.Companion
                .wrapContentHeight()
                .width(150.dp)
                .background(Color.Companion.Transparent)
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

            Box(
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(
                    text = txtCategoria,
                    fontSize = 12.sp,
                    color = Color.Companion.LightGray,
                    maxLines = 1,
                    overflow = TextOverflow.Companion.Clip,
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(
                    text = txtConsola,
                    fontSize = 12.sp,
                    color = Color.Companion.LightGray,
                    maxLines = 1,
                    overflow = TextOverflow.Companion.Clip,
                )
            }

        }
    }
}

@Preview
@Composable
fun ImageTextColumnPreview () {
    ImageTextColumn(txtTitle = "Título del juego", txtCategoria = "Terror", txtConsola = "PS5", imageIdR = R.drawable.a) { }

}