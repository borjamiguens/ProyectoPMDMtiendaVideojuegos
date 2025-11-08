package com.example.proyectopmdmtiendavideojuegos.data.model

import com.example.proyectopmdmtiendavideojuegos.R

// Enumeración de categorías
enum class Categoria(val categoryName: String, val imageResId: Int) {
    AVENTURA(categoryName = "Aventura", imageResId = R.drawable.categoria_aventura),
    ACCION(categoryName = "Acción", imageResId = R.drawable.categoria_accion),
    RPG(categoryName = "RPG", imageResId = R.drawable.categoria_rpg),
    DEPORTES(categoryName = "Deportes", imageResId = R.drawable.categoria_deporte),
    SHOOTER(categoryName = "Shooter", imageResId = R.drawable.categoria_shooter),
    TERROR(categoryName = "Terror", imageResId = R.drawable.categoria_terror),
    PLATAFORMAS(categoryName = "Plataformas", imageResId = R.drawable.categoria_plataformas),
    SIMULACION(categoryName = "Simulación", imageResId = R.drawable.categoria_simulacion),
    ESTRATEGIA(categoryName = "Estrategia", imageResId = R.drawable.categoria_estrategia),
    PUZZLE(categoryName = "Puzzle", imageResId = R.drawable.categoria_puzzle),
    MMO(categoryName = "MMO", imageResId = R.drawable.categoria_mmo),
    CARRERAS(categoryName = "Carreras", imageResId = R.drawable.categoria_carreras)
}