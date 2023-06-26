package com.example.day12assignment

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val supportUs = findViewById<Button>(R.id.button1)
        val android1 = findViewById<CardView>(R.id.and1)
        val web = findViewById<CardView>(R.id.web1)
        val ios = findViewById<CardView>(R.id.ios1)


        supportUs.setOnClickListener {

            val intent = Intent(Intent.ACTION_CALL)
            // Create the text message with a string.
            val sendIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Hello My name is Ajay")
                type = "text/plain"
            }

            // Try to invoke the intent.
            try {
                startActivity(sendIntent)
            } catch (e: ActivityNotFoundException) {
                // Define what your app should do if no activity can handle the intent.
            }
        }


        android1.setOnClickListener {
            intent = Intent(applicationContext,ThirdActivity::class.java)
            startActivity(intent)
        }
        web.setOnClickListener {
            intent = Intent(applicationContext,FourthActivity::class.java)
            startActivity(intent)
        }

        ios.setOnClickListener {
            intent = Intent(applicationContext,FifthActivity::class.java)
            startActivity(intent)
        }
    }
}