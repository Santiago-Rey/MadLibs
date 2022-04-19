package com.example.madlibs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttomStart = findViewById<Button>(R.id.btnStart)
        buttomStart.setOnClickListener {
            start()
        }
    }

    fun start() {

        val intent = Intent(this, WordSpaceActivity::class.java)
        startActivity(intent)

    }

}