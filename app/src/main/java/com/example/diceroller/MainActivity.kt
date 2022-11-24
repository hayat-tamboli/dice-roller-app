package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val resultTextView: ImageView = findViewById(R.id.imageView)
        val myDice = Dice(6).roll()
        var diceImage = R.drawable.dice_1
        when(myDice){
            1 -> diceImage = R.drawable.dice_1
            2 -> diceImage = R.drawable.dice_2
            3 -> diceImage = R.drawable.dice_3
            4 -> diceImage = R.drawable.dice_4
            5 -> diceImage = R.drawable.dice_5
            6 -> diceImage = R.drawable.dice_6
        }
        resultTextView.setImageResource(diceImage)
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}