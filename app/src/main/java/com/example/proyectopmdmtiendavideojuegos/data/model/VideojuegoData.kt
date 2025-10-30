package com.example.proyectopmdmtiendavideojuegos.data.model

object VideojuegoData {
    val listaVideojuegos = listOf(
        Videojuego(
            id = 1,
            nombre = "The Legend of Zelda: Tears of the Kingdom",
            categoria = Categoria.AVENTURA,
            consola = listOf(Consola.NINTENDO_SWITCH),
            precio = 69.99,
            imagenUrl = "https://en.wikipedia.org/wiki/File:The_Legend_of_Zelda_Tears_of_the_Kingdom_cover.jpg"
        ),
        Videojuego(
            id = 2,
            nombre = "Red Dead Redemption 2",
            categoria = Categoria.ACCION,
            consola = listOf(Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X, Consola.PC),
            precio = 59.99,
            imagenUrl = "https://upload.wikimedia.org/wikipedia/en/4/44/Red_Dead_Redemption_II.jpg"
        ),
        Videojuego(
            id = 3,
            nombre = "Minecraft",
            categoria = Categoria.PLATAFORMAS,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X, Consola.NINTENDO_SWITCH),
            precio = 26.95,
            imagenUrl = "https://upload.wikimedia.org/wikipedia/en/5/51/Minecraft_cover.png"
        ),
        Videojuego(
            id = 4,
            nombre = "Fortnite",
            categoria = Categoria.SHOOTER,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X, Consola.NINTENDO_SWITCH),
            precio = 0.0,
            imagenUrl = "https://upload.wikimedia.org/wikipedia/en/thumb/0/01/Fortnite_cover.jpg/220px-Fortnite_cover.jpg"
        ),
        Videojuego(
            id = 5,
            nombre = "Mario Kart 8 Deluxe",
            categoria = Categoria.DEPORTES,
            consola = listOf(Consola.NINTENDO_SWITCH),
            precio = 59.99,
            imagenUrl = "https://upload.wikimedia.org/wikipedia/en/8/8d/Mario_Kart_8_Deluxe.jpg"
        ),
        Videojuego(
            id = 6,
            nombre = "Pokémon Sword",
            categoria = Categoria.AVENTURA,
            consola = listOf(Consola.NINTENDO_SWITCH),
            precio = 59.99,
            imagenUrl = "https://upload.wikimedia.org/wikipedia/en/0/0d/Pokemon_Sword.jpg"
        ),
        Videojuego(
            id = 7,
            nombre = "The Elder Scrolls V: Skyrim",
            categoria = Categoria.RPG,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X),
            precio = 39.99,
            imagenUrl = "https://upload.wikimedia.org/wikipedia/en/5/55/The_Elder_Scrolls_V_Skyrim_cover.jpg"
        )
    )

}