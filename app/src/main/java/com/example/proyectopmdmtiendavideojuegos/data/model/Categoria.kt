package com.example.proyectopmdmtiendavideojuegos.data.model

import com.example.proyectopmdmtiendavideojuegos.R

enum class Categoria(val categoryName: String, val imageResId: Int) {
    AVENTURA(categoryName = "Aventura", imageResId = R.drawable.imagen_prueba),
    ACCION(categoryName = "Acción", imageResId = R.drawable.imagen_prueba),
    RPG(categoryName = "RPG", imageResId = R.drawable.imagen_prueba),
    DEPORTES(categoryName = "Deportes", imageResId = R.drawable.imagen_prueba),
    SHOOTER(categoryName = "Shooter", imageResId = R.drawable.imagen_prueba),
    TERROR(categoryName = "Terror", imageResId = R.drawable.imagen_prueba),
    PLATAFORMAS(categoryName = "Plataformas", imageResId = R.drawable.imagen_prueba),
    SIMULACION(categoryName = "Simulación", imageResId = R.drawable.imagen_prueba),
    ESTRATEGIA(categoryName = "Estrategia", imageResId = R.drawable.imagen_prueba),
    PUZZLE(categoryName = "Puzzle", imageResId = R.drawable.imagen_prueba),
    MMO(categoryName = "MMO", imageResId = R.drawable.imagen_prueba),
    CARRERAS(categoryName = "Carreras", imageResId = R.drawable.imagen_prueba)
}