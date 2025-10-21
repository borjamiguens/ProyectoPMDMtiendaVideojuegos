package com.example.proyectopmdmtiendavideojuegos.myComponents

import android.media.Image
import android.os.Message
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.proyectopmdmtiendavideojuegos.R

@Composable
fun TextImageHorizontal(
    textMessage: Texto
    image: Imagen
){
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight().clickable()){
        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()){
            Text(Texto)
        }
    }

}

@Preview
@Composable
fun TextImageHorizontalPreview(){
    TextImageHorizontal("Texto prueba", R.drawable.ic_launcher_foreground)
}