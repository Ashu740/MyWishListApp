package com.example.mywishlistapp

import android.app.Application
import com.example.mywishlistapp.data.Graph

class WishListApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provide(this)
    }
}