package com.example.travellingplacesapp

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

var currentImage= 0
lateinit var image : ImageView
val places = arrayOf("Aurangabad","Lonavala","Mahabaleshwar","Mumbai","Pune")

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next = findViewById<ImageButton>(R.id.btnNext)
        val prev = findViewById<ImageButton>(R.id.btnPrev)
        val placeName = findViewById<TextView>(R.id.place_name_tv)

        next.setOnClickListener {

            var IdCurrentImageString = "pic$currentImage"

            var IdCurrentImageInt = this.resources.getIdentifier(IdCurrentImageString,"id", packageName)
            image= findViewById(IdCurrentImageInt)
            image.alpha = 0f

            currentImage = (5+currentImage + 1)%5
            var IdNextImageString = "pic$currentImage"

            var IdNextImageInt = this.resources.getIdentifier(IdNextImageString,"id", packageName)
            image = findViewById(IdNextImageInt)
            image.alpha = 1f

            placeName.text = places[currentImage]

        }

        prev.setOnClickListener {

            var IdCurrentImageString = "pic$currentImage"

            var IdCurrentImageInt = this.resources.getIdentifier(IdCurrentImageString,"id", packageName)
            image= findViewById(IdCurrentImageInt)
            image.alpha = 0f

            currentImage = (5+currentImage - 1)%5
            var IdNextImageString = "pic$currentImage"

            var IdNextImageInt = this.resources.getIdentifier(IdNextImageString,"id", packageName)
            image = findViewById(IdNextImageInt)
            image.alpha = 1f

            placeName.text = places[currentImage]


        }

        }
    }
