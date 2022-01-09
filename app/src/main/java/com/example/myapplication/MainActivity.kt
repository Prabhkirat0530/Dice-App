package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollbtn)
        val textview: TextView = findViewById(R.id.textView)
        val imageview: ImageView =findViewById(R.id.imageView)

        rollButton.setOnClickListener{

            Toast.makeText(this,"clicked on Button",Toast.LENGTH_SHORT).show()

            var c :Int = (1..6).random()

            when(c){
                1->imageview.setImageResource(R.drawable.dice_1)
                2->imageview.setImageResource(R.drawable.dice_2)
                3->imageview.setImageResource(R.drawable.dice_3)
                4->imageview.setImageResource(R.drawable.dice_4)
                5->imageview.setImageResource(R.drawable.dice_5)
                6->imageview.setImageResource(R.drawable.dice_6)
                else->imageview.setImageResource(R.drawable.dice_6)
            }

            textview.text = c.toString()
        }

    }
}