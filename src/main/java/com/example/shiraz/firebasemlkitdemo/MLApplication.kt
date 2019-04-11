package com.example.shiraz.firebasemlkitdemo

import android.app.Application
import com.google.firebase.FirebaseApp

class MLApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
    }
}