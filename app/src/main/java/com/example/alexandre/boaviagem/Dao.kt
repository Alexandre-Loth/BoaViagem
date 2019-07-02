package com.example.alexandre.boaviagem

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface LoginDao {
    @Insert
    fun insert(login: Login)
    fun findAll(): List<Login>
    @Query("select * from login where id_login")
    fun findById(id: Int): Login
}

@Dao
interface DestinoDao {
    @Insert
    fun insert(destino: Destino)
    fun findAll(): List<Destino>
    @Query("select * from destino where id_destino")
    fun findById(id: Int): Destino
}

@Dao
interface GastosDao {
    @Insert
    fun insert(gastos: Gastos)
    fun findAll(): List<Gastos>
    @Query("select * from gastos where id_gasto")
    fun findById(id: Int): Gastos
}