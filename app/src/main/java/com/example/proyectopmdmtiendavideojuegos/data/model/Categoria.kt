package com.example.proyectopmdmtiendavideojuegos.data.model

import androidx.annotation.StringRes
import com.example.proyectopmdmtiendavideojuegos.R

// Enumeración de categorías
enum class Categoria(
    @StringRes val nameResId: Int,
    val imageResId: Int
) {
    AVENTURA(R.string.categoria_aventura, R.drawable.categoria_aventura),
    ACCION(R.string.categoria_accion, R.drawable.categoria_accion),
    RPG(R.string.categoria_rpg, R.drawable.categoria_rpg),
    DEPORTES(R.string.categoria_deportes, R.drawable.categoria_deporte),
    SHOOTER(R.string.categoria_shooter, R.drawable.categoria_shooter),
    TERROR(R.string.categoria_terror, R.drawable.categoria_terror),
    PLATAFORMAS(R.string.categoria_plataformas, R.drawable.categoria_plataformas),
    SIMULACION(R.string.categoria_simulacion, R.drawable.categoria_simulacion),
    ESTRATEGIA(R.string.categoria_estrategia, R.drawable.categoria_estrategia),
    PUZZLE(R.string.categoria_puzzle, R.drawable.categoria_puzzle),
    MMO(R.string.categoria_mmo, R.drawable.categoria_mmo),
    CARRERAS(R.string.categoria_carreras, R.drawable.categoria_carreras)
}