import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Search(
    modifier: Modifier = Modifier,
    action: () -> Unit,
) {

    var query by remember { mutableStateOf("") }
Box (
    modifier = Modifier.padding(top = 5.dp)
        .fillMaxWidth()
        .height(70.dp)
    )
{
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        //verticalAlignment = Alignment.CenterVertically,
        //horizontalArrangement = Arrangement.Center
    ) {
        Box (
            modifier = Modifier
                .fillMaxWidth(0.75f)
                .fillMaxHeight(1f)
                .align(Alignment.CenterVertically)
                //.weight(1f)

        ){
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),

                    //.fillMaxSize(),

                        //.padding(2.dp)
                value = query,
                onValueChange = { query = it },
                label = { Text("Buscar") },
                singleLine = true,


            )
        }

        Spacer(modifier = Modifier.width(15.dp))

        Box (
            modifier = Modifier
                .fillMaxWidth(),


        ){
            Icon(
                imageVector = Icons.Filled.Search,
                contentDescription = "Buscar",
                tint = Color.White,
                modifier = Modifier
                    //.size(30.dp)
                    .fillMaxSize()
                    .clickable { action.invoke() }
            )
        }
    }
}
}

@Preview
@Composable
fun SearchPreview() {
    Search (action = {},)
}