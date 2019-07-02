package com.example.alexandre.boaviagem

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Login::class), exportSchema = true, version = 1)
abstract class LoginDatabase(): RoomDatabase(){
    abstract fun loginDao(): LoginDao
}

@Database(entities = arrayOf(Destino::class), exportSchema = true,version = 1)
abstract class  DestinoDatabase(): RoomDatabase(){
    abstract fun destinoDao(): DestinoDao
}

@Database(entities = arrayOf(Gastos::class), exportSchema = true, version = 1)
abstract class GastosDatabase(): RoomDatabase(){
    abstract fun gastosDao(): GastosDao
}
