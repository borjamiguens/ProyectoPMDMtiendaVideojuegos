package com.example.proyectopmdmtiendavideojuegos.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.proyectopmdmtiendavideojuegos.R
import com.example.proyectopmdmtiendavideojuegos.myComponents.ImageTextRow


/*Color primario -> botones, barras superiores, y elementos importantes.
Color secundario -> destacar otras partes, como chips, o switches.
El color de fondo -> color de base de la app.
El color de superficie -> color de las tarjetas o paneles.
El color de texto (onPrimary, onBackground, etc.) -> color de texto se usa sobre esos fondos.*/
private val DarkColorScheme = darkColorScheme(
    /*primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80*/
    primary = SonicGold,
    onPrimary = SonicBlack,
    secondary = SonicGreen,
    onSecondary = SonicCream,
    tertiary = SonicRed,
    onTertiary = SonicCream,
    background = SonicBlack,
    surface = Color(0xFF1E1E1E),
    onSurface = SonicCream,
    error = SonicRed,
    onError = SonicCream
)

private val LightColorScheme = lightColorScheme(
    /*primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40*/
    primary = SonicGreen,
    onPrimary = SonicCream,
    secondary = SonicGold,
    onSecondary = SonicBlack,
    tertiary = SonicRed,
    onTertiary = SonicCream,
    background = SonicCream,
    onBackground = SonicBlack,
    surface = Color.White,
    onSurface = SonicBlack,
    error = SonicRed,
    onError = SonicCream



    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun ProyectoPMDMtiendaVideojuegosTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,  //desactivo esto para que la paleta no sea dinámica
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

//previews para realizar pruebas sobre los ImageTextRow tema oscuro y claro
@Preview
@Composable
fun LightPreview() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = false) {
        ImageTextRow(
            "prueba", R.drawable.juego_minecraft,
            modifier = Modifier,
            action = { }
        )
    }
}

@Preview
@Composable
fun DarkPreview() {
    ProyectoPMDMtiendaVideojuegosTheme(darkTheme = true) {
        ImageTextRow(
            "prueba", R.drawable.juego_minecraft,
            modifier = Modifier,
            action = {  }
        )
    }
}