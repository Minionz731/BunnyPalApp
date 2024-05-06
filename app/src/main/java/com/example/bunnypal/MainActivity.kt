package com.example.bunnypal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var bunnyImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val startGameButton = findViewById<Button>(R.id.startGameButton)
        startGameButton.setOnClickListener {
            setContentView(R.layout.activity_main)
            initializeViews()
        }
    }

    private fun initializeViews() {
        bunnyImage = findViewById(R.id.bunnyImage)
        val feedButton = findViewById<Button>(R.id.feedButton)
        val cleanButton = findViewById<Button>(R.id.cleanButton)
        val playButton = findViewById<Button>(R.id.playButton)
        val sleepButton = findViewById<Button>(R.id.sleepButton)

        feedButton.setOnClickListener {
            feedBunny()
        }

        cleanButton.setOnClickListener {
            cleanBunny()
        }

        playButton.setOnClickListener {
            playWithBunny()
        }

        sleepButton.setOnClickListener {
            makeBunnySleep()
        }
    }

    private fun feedBunny() {
        // Change bunny image and update status
        bunnyImage.setImageResource(R.drawable.bunny_eating)
        // Add logic to update status values
        Toast.makeText(this, getString(R.string.feed_toast), Toast.LENGTH_SHORT).show()
    }

    private fun cleanBunny() {
        // Change bunny image and update status
        bunnyImage.setImageResource(R.drawable.bunny_cleaning)
        // Add logic to update status values
        Toast.makeText(this, getString(R.string.clean_toast), Toast.LENGTH_SHORT).show()
    }

    private fun playWithBunny() {
        // Change bunny image and update status
        bunnyImage.setImageResource(R.drawable.bunny_playing)
        // Add logic to update status values
        Toast.makeText(this, getString(R.string.play_toast), Toast.LENGTH_SHORT).show()
    }

    private fun makeBunnySleep() {
        // Change bunny image and update status
        bunnyImage.setImageResource(R.drawable.bunny_sleeping)
        // Add logic to update status values
        Toast.makeText(this, getString(R.string.sleep_toast), Toast.LENGTH_SHORT).show()
    }
}