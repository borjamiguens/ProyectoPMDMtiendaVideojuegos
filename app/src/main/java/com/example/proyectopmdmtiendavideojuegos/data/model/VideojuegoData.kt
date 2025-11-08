package com.example.proyectopmdmtiendavideojuegos.data.model

import com.example.proyectopmdmtiendavideojuegos.R

object VideojuegoData {
    val listaVideojuegos = listOf(
        Videojuego(
            id = 1,
            nombre = "TLOZ: Tears of the Kingdom",
            descripcion = "Tears of the Kingdom es la secuela de Breath of the Wild, donde Link explora el cielo y las profundidades de Hyrule usando nuevas habilidades para enfrentar una amenaza ancestral.",
            categoria = Categoria.AVENTURA,
            consola = listOf(Consola.NINTENDO_SWITCH),
            precio = 69.99,
            unidadesDisponibles = 25,
            numAlquilados = 67,
            imagenResId = R.drawable.juego_zelda_tears_of_the_kingdom
        ),
        Videojuego(
            id = 2,
            nombre = "Red Dead Redemption 2",
            descripcion = "Red Dead Redemption 2 narra la historia de Arthur Morgan, un forajido que lucha por sobrevivir mientras el Viejo Oeste desaparece bajo el avance de la civilización.",
            categoria = Categoria.ACCION,
            consola = listOf(Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X, Consola.PC),
            precio = 59.99,
            unidadesDisponibles = 40,
            numAlquilados = 120,
            imagenResId = R.drawable.juego_red_dead_redemption_2
        ),
        Videojuego(
            id = 3,
            nombre = "Minecraft",
            descripcion = "Minecraft permite explorar, construir y sobrevivir en mundos generados aleatoriamente formados por bloques, fomentando la creatividad sin límites.",
            categoria = Categoria.PLATAFORMAS,
            consola = listOf(
                Consola.PC,
                Consola.PLAYSTATION_5,
                Consola.XBOX_SERIES_X,
                Consola.NINTENDO_SWITCH
            ),
            precio = 26.95,
            unidadesDisponibles = 100,
            numAlquilados = 350,
            imagenResId = R.drawable.juego_minecraft
        ),
        Videojuego(
            id = 4,
            nombre = "Fortnite: Salvar el Mundo",
            descripcion = "Fortnite es un videojuego de Epic Games que combina construcción y disparos en tercera persona, con modos cooperativos y competitivos llenos de acción y creatividad.",
            categoria = Categoria.SHOOTER,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X),
            precio = 29.99,
            unidadesDisponibles = 10,
            numAlquilados = 35,
            imagenResId = R.drawable.juego_fortnite
        ),
        Videojuego(
            id = 5,
            nombre = "Mario Kart 8 Deluxe",
            descripcion = "Mario Kart 8 Deluxe lleva las carreras más divertidas al máximo nivel, con nuevos personajes, circuitos y objetos para desafiar a tus amigos.",
            categoria = Categoria.CARRERAS,
            consola = listOf(Consola.NINTENDO_SWITCH),
            precio = 59.99,
            unidadesDisponibles = 35,
            numAlquilados = 95,
            imagenResId = R.drawable.juego_mario_kart_8
        ),
        Videojuego(
            id = 6,
            nombre = "Pokémon Sword",
            descripcion = "Pokémon Sword introduce la región de Galar, donde los entrenadores compiten en gimnasios gigantes y descubren criaturas nuevas con formas dinámicas.",
            categoria = Categoria.AVENTURA,
            consola = listOf(Consola.NINTENDO_SWITCH),
            precio = 59.99,
            unidadesDisponibles = 30,
            numAlquilados = 77,
            imagenResId = R.drawable.juego_pokemon_sword
        ),
        Videojuego(
            id = 7,
            nombre = "The Elder Scrolls V: Skyrim",
            descripcion = "Skyrim te sumerge en un mundo abierto lleno de dragones, magia y aventuras, donde tus decisiones moldean el destino del imperio.",
            categoria = Categoria.RPG,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X),
            precio = 39.99,
            unidadesDisponibles = 20,
            numAlquilados = 58,
            imagenResId = R.drawable.juego_skyrim
        ),
        Videojuego(
            id = 8,
            nombre = "God of War Ragnarök",
            descripcion = "Kratos y Atreus regresan en una épica aventura mitológica ambientada en los Nueve Reinos mientras se preparan para el Ragnarök.",
            categoria = Categoria.ACCION,
            consola = listOf(Consola.PLAYSTATION_5, Consola.PLAYSTATION_4),
            precio = 69.99,
            unidadesDisponibles = 50,
            numAlquilados = 140,
            imagenResId = R.drawable.juego_god_of_war_ragnarok
        ),
        Videojuego(
            id = 9,
            nombre = "FIFA 23",
            descripcion = "FIFA 23 ofrece una experiencia de fútbol realista con tecnología HyperMotion y licencias oficiales de las principales ligas del mundo.",
            categoria = Categoria.DEPORTES,
            consola = listOf(
                Consola.PLAYSTATION_5,
                Consola.PLAYSTATION_4,
                Consola.XBOX_SERIES_X,
                Consola.PC
            ),
            precio = 59.99,
            unidadesDisponibles = 70,
            numAlquilados = 200,
            imagenResId = R.drawable.juego_fifa_23
        ),
        Videojuego(
            id = 10,
            nombre = "Grand Theft Auto V",
            descripcion = "GTA V te lleva a Los Santos, una ciudad viva llena de crimen, acción y humor negro, donde tres protagonistas buscan fortuna a su manera.",
            categoria = Categoria.ACCION,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X),
            precio = 29.99,
            unidadesDisponibles = 150,
            numAlquilados = 450,
            imagenResId = R.drawable.juego_grand_theft_auto_v
        ),
        Videojuego(
            id = 11,
            nombre = "Call of Duty: Modern Warfare II",
            descripcion = "Modern Warfare II ofrece combates tácticos intensos, nuevas armas y misiones que llevan la acción militar a un nivel cinematográfico.",
            categoria = Categoria.SHOOTER,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X),
            precio = 69.99,
            unidadesDisponibles = 65,
            numAlquilados = 180,
            imagenResId = R.drawable.juego_call_of_duty_modern_warfare_2
        ),
        Videojuego(
            id = 12,
            nombre = "The Witcher 3: Wild Hunt",
            descripcion = "Encarnas a Geralt de Rivia en una historia épica llena de monstruos, decisiones morales y un vasto mundo abierto para explorar.",
            categoria = Categoria.RPG,
            consola = listOf(
                Consola.PC,
                Consola.PLAYSTATION_5,
                Consola.XBOX_SERIES_X,
                Consola.PLAYSTATION_4,
                Consola.XBOX_ONE
            ),
            precio = 39.99,
            unidadesDisponibles = 90,
            numAlquilados = 260,
            imagenResId = R.drawable.juego_the_witcher_3
        ),
        Videojuego(
            id = 13,
            nombre = "Cyberpunk 2077",
            descripcion = "Explora Night City, una metrópolis futurista llena de corrupción y tecnología, en este RPG de mundo abierto lleno de acción.",
            categoria = Categoria.ACCION,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X),
            precio = 49.99,
            unidadesDisponibles = 50,
            numAlquilados = 150,
            imagenResId = R.drawable.juego_cyberpunk_2077
        ),
        Videojuego(
            id = 14,
            nombre = "Horizon Forbidden West",
            descripcion = "Acompaña a Aloy en un viaje por tierras desconocidas para descubrir los secretos del pasado y salvar el futuro de la humanidad.",
            categoria = Categoria.AVENTURA,
            consola = listOf(Consola.PLAYSTATION_5, Consola.PLAYSTATION_4),
            precio = 69.99,
            unidadesDisponibles = 35,
            numAlquilados = 90,
            imagenResId = R.drawable.juego_horizon_forbidden_west
        ),
        Videojuego(
            id = 15,
            nombre = "Gran Turismo 7",
            descripcion = "Gran Turismo 7 ofrece una experiencia de conducción realista con una amplia selección de coches y circuitos legendarios.",
            categoria = Categoria.CARRERAS,
            consola = listOf(Consola.PLAYSTATION_5, Consola.PLAYSTATION_4),
            precio = 69.99,
            unidadesDisponibles = 30,
            numAlquilados = 75,
            imagenResId = R.drawable.juego_gran_turismo_5
        ),
        Videojuego(
            id = 16,
            nombre = "Forza Horizon 5",
            descripcion = "Conduce por paisajes vibrantes de México en el festival Horizon más grande y dinámico hasta la fecha.",
            categoria = Categoria.CARRERAS,
            consola = listOf(Consola.XBOX_SERIES_X, Consola.XBOX_ONE, Consola.PC),
            precio = 59.99,
            unidadesDisponibles = 30,
            numAlquilados = 85,
            imagenResId = R.drawable.juego_forza_horizon_5
        ),
        Videojuego(
            id = 17,
            nombre = "Animal Crossing: New Horizons",
            descripcion = "Crea tu propio paraíso en una isla desierta, personaliza tu hogar y convive con adorables vecinos animales.",
            categoria = Categoria.SIMULACION,
            consola = listOf(Consola.NINTENDO_SWITCH),
            precio = 49.99,
            unidadesDisponibles = 50,
            numAlquilados = 160,
            imagenResId = R.drawable.juego_animal_crossing_new_horizons
        ),
        Videojuego(
            id = 18,
            nombre = "Super Mario Odyssey",
            descripcion = "Acompaña a Mario y su nuevo amigo Cappy en una aventura mundial para rescatar a la princesa Peach de Bowser.",
            categoria = Categoria.PLATAFORMAS,
            consola = listOf(Consola.NINTENDO_SWITCH),
            precio = 59.99,
            unidadesDisponibles = 45,
            numAlquilados = 130,
            imagenResId = R.drawable.juego_super_mario_odyssey
        ),
        Videojuego(
            id = 19,
            nombre = "Luigi's Mansion 3",
            descripcion = "Ayuda a Luigi a rescatar a sus amigos atrapados en un hotel encantado lleno de fantasmas y secretos.",
            categoria = Categoria.AVENTURA,
            consola = listOf(Consola.NINTENDO_SWITCH),
            precio = 49.99,
            unidadesDisponibles = 15,
            numAlquilados = 45,
            imagenResId = R.drawable.juego_luigi_s_mansion_3
        ),
        Videojuego(
            id = 20,
            nombre = "Hades",
            descripcion = "Escapa del Inframundo en este adictivo roguelike de acción con una narrativa rica basada en la mitología griega.",
            categoria = Categoria.ACCION,
            consola = listOf(
                Consola.PC,
                Consola.NINTENDO_SWITCH,
                Consola.PLAYSTATION_5,
                Consola.XBOX_SERIES_X
            ),
            precio = 24.99,
            unidadesDisponibles = 20,
            numAlquilados = 70,
            imagenResId = R.drawable.juego_hades
        ),
        Videojuego(
            id = 21,
            nombre = "Celeste",
            descripcion = "Celeste combina plataformas desafiantes con una historia emocional sobre la superación personal y la ansiedad.",
            categoria = Categoria.PLATAFORMAS,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_4, Consola.NINTENDO_SWITCH),
            precio = 19.99,
            unidadesDisponibles = 8,
            numAlquilados = 25,
            imagenResId = R.drawable.juego_celeste
        ),
        Videojuego(
            id = 22,
            nombre = "Stardew Valley",
            descripcion = "Construye una granja, forma amistades y descubre misterios en este encantador simulador de vida rural.",
            categoria = Categoria.SIMULACION,
            consola = listOf(
                Consola.PC,
                Consola.NINTENDO_SWITCH,
                Consola.PLAYSTATION_4,
                Consola.XBOX_ONE
            ),
            precio = 14.99,
            unidadesDisponibles = 45,
            numAlquilados = 120,
            imagenResId = R.drawable.juego_stardew_valley
        ),
        Videojuego(
            id = 23,
            nombre = "Dark Souls III",
            descripcion = "Dark Souls III ofrece combates intensos y una atmósfera oscura donde la paciencia y la estrategia son esenciales.",
            categoria = Categoria.RPG,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_4, Consola.XBOX_ONE),
            precio = 39.99,
            unidadesDisponibles = 25,
            numAlquilados = 80,
            imagenResId = R.drawable.juego_dark_souls_3
        ),
        Videojuego(
            id = 24,
            nombre = "Sekiro: Shadows Die Twice",
            descripcion = "Toma el papel de un guerrero shinobi en busca de venganza en un Japón feudal oscuro y peligroso.",
            categoria = Categoria.ACCION,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_4, Consola.XBOX_ONE),
            precio = 49.99,
            unidadesDisponibles = 20,
            numAlquilados = 60,
            imagenResId = R.drawable.juego_sekiro
        ),
        Videojuego(
            id = 25,
            nombre = "Persona 5 Royal",
            descripcion = "Únete a los Ladrones Fantasma y cambia el corazón de los corruptos en este aclamado JRPG con estilo y profundidad.",
            categoria = Categoria.RPG,
            consola = listOf(Consola.PLAYSTATION_4, Consola.PLAYSTATION_5),
            precio = 59.99,
            unidadesDisponibles = 18,
            numAlquilados = 50,
            imagenResId = R.drawable.juego_persona_5
        ),
        Videojuego(
            id = 26,
            nombre = "Monster Hunter Rise",
            descripcion = "Enfréntate a monstruos colosales, fabrica armas y mejora tu equipo en cacerías épicas llenas de acción cooperativa.",
            categoria = Categoria.ACCION,
            consola = listOf(Consola.NINTENDO_SWITCH, Consola.PC),
            precio = 49.99,
            unidadesDisponibles = 25,
            numAlquilados = 65,
            imagenResId = R.drawable.juego_monster_hunter_rise
        ),
        Videojuego(
            id = 27,
            nombre = "Splatoon 2",
            descripcion = "Participa en batallas de pintura por equipos donde la estrategia y la rapidez deciden quién cubre más territorio.",
            categoria = Categoria.SHOOTER,
            consola = listOf(Consola.NINTENDO_SWITCH),
            precio = 39.99,
            unidadesDisponibles = 18,
            numAlquilados = 55,
            imagenResId = R.drawable.juego_splatoon_2
        ),
        Videojuego(
            id = 28,
            nombre = "Metroid Dread",
            descripcion = "Samus Aran regresa en una nueva aventura de desplazamiento lateral donde enfrenta amenazas letales en el planeta ZDR.",
            categoria = Categoria.PLATAFORMAS,
            consola = listOf(Consola.NINTENDO_SWITCH),
            precio = 59.99,
            unidadesDisponibles = 15,
            numAlquilados = 40,
            imagenResId = R.drawable.juego_metroid_dread
        ),
        Videojuego(
            id = 29,
            nombre = "Tetris Effect",
            descripcion = "Tetris Effect transforma el clásico rompecabezas en una experiencia audiovisual hipnótica llena de música y efectos visuales.",
            categoria = Categoria.PUZZLE,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_4, Consola.XBOX_ONE),
            precio = 29.99,
            unidadesDisponibles = 7,
            numAlquilados = 20,
            imagenResId = R.drawable.juego_tetris_effect
        ),
        Videojuego(
            id = 30,
            nombre = "Resident Evil Village",
            descripcion = "Acompaña a Ethan Winters en una historia de terror y supervivencia ambientada en una aldea llena de horrores inimaginables.",
            categoria = Categoria.TERROR,
            consola = listOf(Consola.PC, Consola.PLAYSTATION_5, Consola.XBOX_SERIES_X),
            precio = 59.99,
            unidadesDisponibles = 35,
            numAlquilados = 110,
            imagenResId = R.drawable.juego_resident_evil_village
        )
    )
}