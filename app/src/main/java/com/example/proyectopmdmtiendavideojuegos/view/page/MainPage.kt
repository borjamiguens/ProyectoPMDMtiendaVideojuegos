package com.example.proyectopmdmtiendavideojuegos.view.page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.proyectopmdmtiendavideojuegos.view.component.GamesRow
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme
import com.example.proyectopmdmtiendavideojuegos.viewModel.vm.MainPageVM

@Composable
fun MainPage(
    modifier: Modifier = Modifier,
    viewModel: MainPageVM = viewModel(),
    onJuegoClick: (Int) -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.loadJuegos()
    }

    if (uiState.isLoading) {
        Text(
            text = "Cargando...",
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.onBackground
        )
    } else {
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                GamesRow(
                    title = "JUEGOS DESTACADOS",
                    gameList = uiState.juegosDestacados,
                    onGameClick = onJuegoClick
                )
            }
            item {
                GamesRow(
                    title = "JUEGOS RECIENTES",
                    gameList = uiState.juegosRecientes,
                    onGameClick = onJuegoClick
                )
            }
            item {
                GamesRow(
                    title = "JUEGOS ALEATORIOS",
                    gameList = uiState.juegosAleatorios,
                    onGameClick = onJuegoClick
                )
            }
        }
    }
}

@Preview
@Composable
fun MainPagePreview() {
    ProyectoPMDMtiendaVideojuegosTheme {
        MainPage(onJuegoClick = {})
    }
}
