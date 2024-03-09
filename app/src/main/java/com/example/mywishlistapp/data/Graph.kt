package com.example.mywishlistapp.data

import android.content.Context
import androidx.room.Room

object Graph {
    lateinit var dataBase: WishDataBase

    val wishRepository by lazy {
        WishRepository(wishDao = dataBase.wishDao())
    }

    fun provide(context: Context){
        dataBase = Room.databaseBuilder(context,WishDataBase::class.java,"wishlist.db").build()
    }
}