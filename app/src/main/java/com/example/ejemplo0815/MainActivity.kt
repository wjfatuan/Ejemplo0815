package com.example.ejemplo0815

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
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
            if(leftNumber>=rightNumber) {
                binding.myText.text = "You are a winner!!"
            }
            else {
                binding.myText.text = "Good luck next time :("
            }
            resetNumbers()
        }

        binding.buttonRight.setOnClickListener{
            if(leftNumber<=rightNumber) {
                binding.myText.text = "You are a winner!!"
            }
            else {
                binding.myText.text = "Good luck next time :("
            }
            resetNumbers()
        }

    }

    fun resetNumbers() {
        leftNumber = (0..100).random()
        rightNumber = (0..100).random()
    }
}