package com.example.skillshare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav_view)

        val navController = findNavController(R.id.fragment3)

        bottomNavigationView.setupWithNavController(navController)
    }
}