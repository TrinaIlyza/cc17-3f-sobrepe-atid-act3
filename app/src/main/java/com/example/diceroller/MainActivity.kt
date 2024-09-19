package com.example.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
        private lateinit var rollButton: Button
        private lateinit var diceImage: ImageView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            rollButton = findViewById(R.id.button)
            diceImage = findViewById(R.id.imageView)
            rollButton.setOnClickListener { rollDice() }
        }

        private fun rollDice() {
            // Generate a random number between 1 and 6
            val randomNumber = (1..6).random()

            // Set the image resource based on the random number
            when (randomNumber) {
                1 -> diceImage.setImageResource(R.drawable.dice_one)
                2 -> diceImage.setImageResource(R.drawable.dice_two)
                3 -> diceImage.setImageResource(R.drawable.dice_three)
                4 -> diceImage.setImageResource(R.drawable.dice_four)
                5 -> diceImage.setImageResource(R.drawable.dice_five)
                6 -> diceImage.setImageResource(R.drawable.dice_six)
            }
        }
    }
