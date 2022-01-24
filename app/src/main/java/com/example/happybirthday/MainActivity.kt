package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // storing ID of the button
        // in a variable
        val button = findViewById<Button>(R.id.button)
        val backgroundImage = findViewById<ImageView>(R.id.imageView)

        // operations to be performed
        // when user tap on the button
        button?.setOnClickListener()
        {
            // toggling visibility of background image
            backgroundImage.isVisible = !backgroundImage.isVisible
        }

    }
}
