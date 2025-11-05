package com.example.proyectopmdmtiendavideojuegos.data.model

import com.example.proyectopmdmtiendavideojuegos.R

object VideojuegoData {
    val listaVideojuegos = listOf(
        Videojuego(
            id = 1,
            nombre = "TLOZ: Tears of the Kingdom",
            categoria = Categoria.AVENTURA,
            consola = listOf(Consola.NINTENDO_SWITCH),
            precio = 69.99,
            numVentas = 67,
            imagenResId = R.drawable.juego_zeldatotk
        ),
        Videojuego(
            id = 2,
            nombre = "Red Dead Redemption 2",
            categoria = Categoria.ACCION,
            consola = listOf(Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X, Consola.PC),
            precio = 59.99,
            numVentas = 120,
            imagenResId = R.drawable.juego_rdr2
        ),
        Videojuego(
            id = 3,
            nombre = "Minecraft",
            categoria = Categoria.PLATAFORMAS,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X, Consola.NINTENDO_SWITCH),
            precio = 26.95,
            numVentas = 350,
            imagenResId = R.drawable.juego_minecraft
        ),
        Videojuego(
            id = 4,
            nombre = "Fortnite: Salvar el Mundo",
            categoria = Categoria.SHOOTER,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X),
            precio = 29.99,
            numVentas = 35,
            imagenResId = R.drawable.juego_fortnite
        ),
        Videojuego(
            id = 5,
            nombre = "Mario Kart 8 Deluxe",
            categoria = Categoria.CARRERAS,
            consola = listOf(Consola.NINTENDO_SWITCH),
            precio = 59.99,
            numVentas = 95,
            imagenResId = R.drawable.juego_mariokart8
        ),
        Videojuego(
            id = 6,
            nombre = "Pokémon Sword",
            categoria = Categoria.AVENTURA,
            consola = listOf(Consola.NINTENDO_SWITCH),
            precio = 59.99,
            numVentas = 77,
            imagenResId = R.drawable.juego_pokemonsword
        ),
        Videojuego(
            id = 7,
            nombre = "The Elder Scrolls V: Skyrim",
            categoria = Categoria.RPG,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X),
            precio = 39.99,
            numVentas = 58,
            imagenResId = R.drawable.juego_skyrim
        ),
        Videojuego(
            id = 8,
            nombre = "God of War Ragnarök",
            categoria = Categoria.ACCION,
            consola = listOf(Consola.PLAYSTATION_5, Consola.PLAYSTATION_4),
            precio = 69.99,
            numVentas = 140,
            imagenResId = R.drawable.imagen_prueba
        ),
        Videojuego(
            id = 9,
            nombre = "FIFA 23",
            categoria = Categoria.DEPORTES,
            consola = listOf(Consola.PLAYSTATION_5, Consola.PLAYSTATION_4, Consola.XBOX_SERIES_X, Consola.PC),
            precio = 59.99,
            numVentas = 200,
            imagenResId = R.drawable.imagen_prueba
        ),
        Videojuego(
            id = 10,
            nombre = "GTA V",
            categoria = Categoria.ACCION,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X),
            precio = 29.99,
            numVentas = 450,
            imagenResId = R.drawable.imagen_prueba
        ),
        Videojuego(
            id = 11,
            nombre = "Call of Duty: Modern Warfare II",
            categoria = Categoria.SHOOTER,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X),
            precio = 69.99,
            numVentas = 180,
            imagenResId = R.drawable.imagen_prueba
        ),
        Videojuego(
            id = 12,
            nombre = "The Witcher 3: Wild Hunt",
            categoria = Categoria.RPG,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X, Consola.PLAYSTATION_4, Consola.XBOX_ONE),
            precio = 39.99,
            numVentas = 260,
            imagenResId = R.drawable.imagen_prueba
        ),
        Videojuego(
            id = 13,
            nombre = "Cyberpunk 2077",
            categoria = Categoria.ACCION,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X),
            precio = 49.99,
            numVentas = 150,
            imagenResId = R.drawable.imagen_prueba
        ),
        Videojuego(
            id = 14,
            nombre = "Horizon Forbidden West",
            categoria = Categoria.AVENTURA,
            consola = listOf(Consola.PLAYSTATION_5, Consola.PLAYSTATION_4),
            precio = 69.99,
            numVentas = 90,
            imagenResId = R.drawable.imagen_prueba
        ),
        Videojuego(
            id = 15,
            nombre = "Gran Turismo 7",
            categoria = Categoria.CARRERAS,
            consola = listOf(Consola.PLAYSTATION_5, Consola.PLAYSTATION_4),
            precio = 69.99,
            numVentas = 75,
            imagenResId = R.drawable.imagen_prueba
        ),
        Videojuego(
            id = 16,
            nombre = "Forza Horizon 5",
            categoria = Categoria.CARRERAS,
            consola = listOf(Consola.XBOX_SERIES_X, Consola.XBOX_ONE, Consola.PC),
            precio = 59.99,
            numVentas = 85,
            imagenResId = R.drawable.imagen_prueba
        ),
        Videojuego(
            id = 17,
            nombre = "Animal Crossing: New Horizons",
            categoria = Categoria.SIMULACION,
            consola = listOf(Consola.NINTENDO_SWITCH),
            precio = 49.99,
            numVentas = 160,
            imagenResId = R.drawable.imagen_prueba
        ),
        Videojuego(
            id = 18,
            nombre = "Super Mario Odyssey",
            categoria = Categoria.PLATAFORMAS,
            consola = listOf(Consola.NINTENDO_SWITCH),
            precio = 59.99,
            numVentas = 130,
            imagenResId = R.drawable.imagen_prueba
        ),
        Videojuego(
            id = 19,
            nombre = "Luigi's Mansion 3",
            categoria = Categoria.AVENTURA,
            consola = listOf(Consola.NINTENDO_SWITCH),
            precio = 49.99,
            numVentas = 45,
            imagenResId = R.drawable.imagen_prueba
        ),
        Videojuego(
            id = 20,
            nombre = "Hades",
            categoria = Categoria.ACCION,
            consola = listOf(Consola.PC, Consola.NINTENDO_SWITCH, Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X),
            precio = 24.99,
            numVentas = 70,
            imagenResId = R.drawable.imagen_prueba
        ),
        Videojuego(
            id = 21,
            nombre = "Celeste",
            categoria = Categoria.PLATAFORMAS,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_4, Consola.NINTENDO_SWITCH),
            precio = 19.99,
            numVentas = 25,
            imagenResId = R.drawable.imagen_prueba
        ),
        Videojuego(
            id = 22,
            nombre = "Stardew Valley",
            categoria = Categoria.SIMULACION,
            consola = listOf(Consola.PC, Consola.NINTENDO_SWITCH, Consola.PLAYSTATION_4, Consola.XBOX_ONE),
            precio = 14.99,
            numVentas = 120,
            imagenResId = R.drawable.imagen_prueba
        ),
        Videojuego(
            id = 23,
            nombre = "Dark Souls III",
            categoria = Categoria.RPG,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_4, Consola.XBOX_ONE),
            precio = 39.99,
            numVentas = 80,
            imagenResId = R.drawable.imagen_prueba
        ),
        Videojuego(
            id = 24,
            nombre = "Sekiro: Shadows Die Twice",
            categoria = Categoria.ACCION,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_4, Consola.XBOX_ONE),
            precio = 49.99,
            numVentas = 60,
            imagenResId = R.drawable.imagen_prueba
        ),
        Videojuego(
            id = 25,
            nombre = "Persona 5 Royal",
            categoria = Categoria.RPG,
            consola = listOf(Consola.PLAYSTATION_4, Consola.PLAYSTATION_5),
            precio = 59.99,
            numVentas = 50,
            imagenResId = R.drawable.imagen_prueba
        ),
        Videojuego(
            id = 26,
            nombre = "Monster Hunter Rise",
            categoria = Categoria.ACCION,
            consola = listOf(Consola.NINTENDO_SWITCH, Consola.PC),
            precio = 49.99,
            numVentas = 65,
            imagenResId = R.drawable.imagen_prueba
        ),
        Videojuego(
            id = 27,
            nombre = "Splatoon 2",
            categoria = Categoria.SHOOTER,
            consola = listOf(Consola.NINTENDO_SWITCH),
            precio = 39.99,
            numVentas = 55,
            imagenResId = R.drawable.imagen_prueba
        ),
        Videojuego(
            id = 28,
            nombre = "Metroid Dread",
            categoria = Categoria.PLATAFORMAS,
            consola = listOf(Consola.NINTENDO_SWITCH),
            precio = 59.99,
            numVentas = 40,
            imagenResId = R.drawable.imagen_prueba
        ),
        Videojuego(
            id = 29,
            nombre = "Tetris Effect",
            categoria = Categoria.PUZZLE,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_4, Consola.XBOX_ONE),
            precio = 29.99,
            numVentas = 20,
            imagenResId = R.drawable.imagen_prueba
        ),
        Videojuego(
            id = 30,
            nombre = "Resident Evil Village",
            categoria = Categoria.TERROR,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X),
            precio = 59.99,
            numVentas = 110,
            imagenResId = R.drawable.imagen_prueba
        )
    )
}