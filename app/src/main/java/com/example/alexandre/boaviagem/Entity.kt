package com.example.alexandre.boaviagem

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "login")
data class Login(
    val nome_login: String,
    val senha_login: String) {
    @PrimaryKey (autoGenerate = true)
    var id_login: Int = 0
}

@Entity(tableName = "destino")
data class Destino(
    val local_destinho: String,
    val tipo_viagem_destino: String,
    val data_partida_destino: Int,
    val data_chegada_destino: Int,
    val orcamento_destino: Float,
    val qtdd_destino: Int) {
    @PrimaryKey (autoGenerate = true)
    var id_destino: Int = 0
}

@Entity(tableName = "Gastos")
data class Gastos(
    val tipo_gasto: String,
    val valor_gasto: Float,
    val data_gasto: Int,
    val descricao_gasto: String,
    val local_gasto: String) {
    @PrimaryKey (autoGenerate = true)
    var id_gasto: Int = 0
}



