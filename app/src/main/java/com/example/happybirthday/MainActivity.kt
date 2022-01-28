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
        var switch: Int = 1

        // operations to be performed
        // when user tap on the button
        button?.setOnClickListener()
        {
            switch = (switch + 1)%4;
            //can also use to set variable
            val drawableResource = when (switch) {
                1 -> R.drawable.androidparty1
                2 -> R.drawable.androidparty2
                3 -> R.drawable.androidparty3
                0 -> R.drawable.androidparty4
                else -> R.drawable.androidparty1
            }

            backgroundImage.setImageResource(drawableResource);
        }

    }
}
