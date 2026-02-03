package com.example.proyectopmdmtiendavideojuegos.view.page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.proyectopmdmtiendavideojuegos.model.MyListItem
import com.example.proyectopmdmtiendavideojuegos.view.component.ImageTextRow
import com.example.proyectopmdmtiendavideojuegos.view.component.Title
import com.example.proyectopmdmtiendavideojuegos.viewModel.vm.GenericListPageVM

@Composable
fun GenericListPage(
    title: String,
    items: List<MyListItem>,
    onItemClick: (MyListItem) -> Unit = {},
    viewModel: GenericListPageVM = viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.loadItems(title, items)
    }

    if (uiState.isLoading) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            androidx.compose.material3.Text("Cargando...")
        }
    } else {

        val scrollState = rememberScrollState()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .verticalScroll(scrollState),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(20.dp))

            // Título
            Title(name = uiState.title)

            Spacer(modifier = Modifier.height(25.dp))

            // Lista de items
            uiState.items.forEach { item ->
                ImageTextRow(
                    txtMsg = item.name,
                    imageIdR = item.imageResId,
                    modifier = Modifier
                        .height(80.dp)
                        .width(320.dp)
                ) {
                    onItemClick(item)
                }
                Spacer(modifier = Modifier.height(30.dp))
            }
        }
    }
}
