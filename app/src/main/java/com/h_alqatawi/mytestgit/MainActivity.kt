package com.h_alqatawi.mytestgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("THIS IS CONTENT IN MY SECOND COMMIT ")
        println("LOCAL CHANGE")
        println("Change 4")
        println("THIS LINE WILL BE MERGED")
        println("Hello from your friend")

    }
}