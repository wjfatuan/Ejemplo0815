package com.example.ejemplo0815

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.ejemplo0815.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var leftNumber = 0
    var rightNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        resetNumbers()

        binding.buttonLeft.setOnClickListener{
            binding.myText.text = checkResult(leftNumber,rightNumber)
        }

        binding.buttonRight.setOnClickListener{
            binding.myText.text = checkResult(rightNumber, leftNumber)
        }

    }

    fun checkResult(guess: Int, other:Int): String {
        resetNumbers()
        if(guess>=other) {
            return "You are a winner!!"
        }
        else {
            return "Good luck next time :("
        }

    }

    fun resetNumbers() {
        leftNumber = (0..100).random()
        rightNumber = (0..100).random()
    }
}