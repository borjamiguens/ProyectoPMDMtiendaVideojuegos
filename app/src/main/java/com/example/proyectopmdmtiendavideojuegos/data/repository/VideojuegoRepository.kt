package com.example.proyectopmdmtiendavideojuegos.data.repository

import com.example.proyectopmdmtiendavideojuegos.data.api.VideojuegoApi
import com.example.proyectopmdmtiendavideojuegos.data.dto.VideojuegoDto
import com.example.proyectopmdmtiendavideojuegos.domain.model.Videojuego
import com.example.proyectopmdmtiendavideojuegos.data.mapper.toDomain
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

// Sealed class para representar estados
sealed class Result<out T> {
    object Loading : Result<Nothing>()
    data class Success<T>(val data: T) : Result<T>()
    data class Error(val message: String) : Result<Nothing>()
}

class GameRepository(
    private val api: VideojuegoApi
) {

    // Obtener lista de videojuegos
    fun getGames(): Flow<Result<List<Videojuego>>> = flow {
        emit(Result.Loading) // Loading
        try {
            val response: List<VideojuegoDto> = api.getVideojuegos() // llamada Retrofit
            val games: List<Videojuego> = response.map { it.toDomain() } // Mapper
            emit(Result.Success(games)) // Success
        } catch (e: IOException) {
            // Error de red
            emit(Result.Error("Error de conexión. Revisa tu internet."))
        } catch (e: HttpException) {
            // Error HTTP (404, 500...)
            emit(Result.Error("Error del servidor: ${e.code()}"))
        } catch (e: Exception) {
            emit(Result.Error("Ocurrió un error inesperado."))
        }
    }

    // Ejemplo: obtener un juego por ID
    fun getGameById(id: Int): Flow<Result<Videojuego>> = flow {
        emit(Result.Loading)
        try {
            val dto = api.getVideojuego(id)
            emit(Result.Success(dto.toDomain()))
        } catch (e: IOException) {
            emit(Result.Error("Error de conexión."))
        } catch (e: HttpException) {
            emit(Result.Error("Error del servidor: ${e.code()}"))
        }
    }

}
