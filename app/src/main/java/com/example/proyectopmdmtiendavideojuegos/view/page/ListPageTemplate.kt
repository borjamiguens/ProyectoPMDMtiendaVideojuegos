package com.example.proyectopmdmtiendavideojuegos.view.page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.proyectopmdmtiendavideojuegos.model.MyListItem
import com.example.proyectopmdmtiendavideojuegos.view.component.ImageTextRow
import com.example.proyectopmdmtiendavideojuegos.view.component.Title

@Composable
fun GenericListPage(
    title: String,
    items: List<MyListItem>,
    onItemClick: (MyListItem) -> Unit = {}
) {

    val verticalScrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(verticalScrollState),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(20.dp))

        // Título
        Title(name = title)

        Spacer(modifier = Modifier.height(25.dp))

        // Lista de videojuegos
        items.forEach { item ->
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