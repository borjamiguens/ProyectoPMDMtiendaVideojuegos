import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdmtiendavideojuegos.R
import com.example.proyectopmdmtiendavideojuegos.ui.theme.ProyectoPMDMtiendaVideojuegosTheme


@Composable
fun Search(
    modifier: Modifier = Modifier,
    action: () -> Unit,
) {

    var query by remember { mutableStateOf("") }
    Box(
        modifier = Modifier
            .padding(top = 5.dp)
            .fillMaxWidth()
            .size(70.dp),
        contentAlignment = Alignment.Center

    )

    {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            // Recuadro de búsqueda
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(0.75f)
                    .fillMaxHeight(0.9f)
                    .padding(start = 10.dp),
                value = query,
                onValueChange = { query = it },
                label = { stringResource(id = R.string.searchcomponent_buscar) },
                singleLine = true
            )

            Spacer(modifier = Modifier.width(15.dp))

            // Icono lupa
            Icon(
                imageVector = Icons.Filled.Search,
                contentDescription = "Búsqueda",
                tint = MaterialTheme.colorScheme.onPrimary,
                modifier = Modifier
                    .fillMaxSize()
                    .clickable { action.invoke() }
            )
        }
    }
}


@Preview
@Composable
fun SearchPreview() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = true) {
        Search(action = {})
    }
}