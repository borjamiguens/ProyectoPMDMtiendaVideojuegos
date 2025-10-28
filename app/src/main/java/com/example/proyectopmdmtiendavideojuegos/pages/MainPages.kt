package com.example.proyectopmdmtiendavideojuegos.pages

import Search
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdmtiendavideojuegos.R
import com.example.proyectopmdmtiendavideojuegos.myComponents.BottomBarButton
import com.example.proyectopmdmtiendavideojuegos.myComponents.ImageTextColumn
import com.example.proyectopmdmtiendavideojuegos.myComponents.Logo
import com.example.proyectopmdmtiendavideojuegos.myComponents.Title

@Composable
fun SelectorPage() {

    val verticalScrollState = rememberScrollState()
    val horizontalScrollStateJuegosDestacados = rememberScrollState()
    val horizontalScrollStateJuegosRecientes = rememberScrollState()

    data class ImageTextColumnData(
        val txtTitle: String,
        val txtCategoria: String,
        val txtConsola: String,
        val imageIdR: Int
    )

    Scaffold(
        containerColor = Color(0xFF0d0d0d),
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF0d0d0d))
                    .padding(vertical = 15.dp, horizontal = 15.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Logo(
                    logo = R.drawable.a,
                    name = "NOMBRE",
                    modifier = Modifier
                ) { }

                Spacer(modifier = Modifier.width(15.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth(),
                ) {
                    Search(
                        modifier = Modifier
                            .height(40.dp)
                    ) { }
                }
            }
        },




                bottomBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF0d0d0d))
                    .padding(vertical = 10.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                BottomBarButton(
                    image = R.drawable.a,
                    text = "HOME",
                    modifier = Modifier
                        .navigationBarsPadding()
                        .width(60.dp)
                ) { }

                BottomBarButton(
                    image = R.drawable.a,
                    text = "CONSOLAS",
                    modifier = Modifier
                        .navigationBarsPadding()
                        .width(60.dp)
                ) { }

                BottomBarButton(
                    image = R.drawable.a,
                    text = "CATEGORIAS",
                    modifier = Modifier
                        .navigationBarsPadding()
                        .width(60.dp)
                ) { }

                BottomBarButton(
                    image = R.drawable.a,
                    text = "LOGIN",
                    modifier = Modifier
                        .navigationBarsPadding()
                        .width(60.dp)
                ) { }

                BottomBarButton(
                    image = R.drawable.a,
                    text = "PERFIL",
                    modifier = Modifier
                        .navigationBarsPadding()
                        .width(60.dp)
                ) { }
            }
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF0d0d0d))
                .verticalScroll(verticalScrollState)
                .padding(paddingValues)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Title(
                    name = "JUEGOS DESTACADOS",
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 10.dp)
                    .statusBarsPadding(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                val madeForYou = List(6) {
                    ImageTextColumnData(
                        txtTitle = "Título $it",
                        txtCategoria = "Terror",
                        txtConsola = "PS5",
                        imageIdR = R.drawable.a
                    )
                }.shuffled()

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(horizontalScrollStateJuegosDestacados)
                        .padding(top = 15.dp, start = 15.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    madeForYou.forEach { item ->
                        ImageTextColumn(
                            txtTitle = item.txtTitle,
                            txtCategoria = item.txtCategoria,
                            txtConsola = item.txtConsola,
                            imageIdR = item.imageIdR,
                            modifier = Modifier.width(150.dp)
                        ) {
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun SelectorPagePreview() {
    SelectorPage()
}
