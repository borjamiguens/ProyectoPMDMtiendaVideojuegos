package com.example.proyectopmdmtiendavideojuegos.data.model

import com.example.proyectopmdmtiendavideojuegos.R

object VideojuegoData {
    val listaVideojuegos = listOf(
        Videojuego(
            id = 1,
            nombre = "The Legend of Zelda: Tears of the Kingdom",
            categoria = Categoria.AVENTURA,
            consola = listOf(Consola.NINTENDO_SWITCH),
            precio = 69.99,
            imagenResId = R.drawable.a
        ),
        Videojuego(
            id = 2,
            nombre = "Red Dead Redemption 2",
            categoria = Categoria.ACCION,
            consola = listOf(Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X, Consola.PC),
            precio = 59.99,
            imagenResId = R.drawable.a
        ),
        Videojuego(
            id = 3,
            nombre = "Minecraft",
            categoria = Categoria.PLATAFORMAS,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X, Consola.NINTENDO_SWITCH),
            precio = 26.95,
            imagenResId = R.drawable.a
        ),
        Videojuego(
            id = 4,
            nombre = "Fortnite",
            categoria = Categoria.SHOOTER,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X, Consola.NINTENDO_SWITCH),
            precio = 0.0,
            imagenResId = R.drawable.a
        ),
        Videojuego(
            id = 5,
            nombre = "Mario Kart 8 Deluxe",
            categoria = Categoria.DEPORTES,
            consola = listOf(Consola.NINTENDO_SWITCH),
            precio = 59.99,
            imagenResId = R.drawable.a
        ),
        Videojuego(
            id = 6,
            nombre = "Pokémon Sword",
            categoria = Categoria.AVENTURA,
            consola = listOf(Consola.NINTENDO_SWITCH),
            precio = 59.99,
            imagenResId = R.drawable.a
        ),
        Videojuego(
            id = 7,
            nombre = "The Elder Scrolls V: Skyrim",
            categoria = Categoria.RPG,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X),
            precio = 39.99,
            imagenResId = R.drawable.a
        )
    )

}