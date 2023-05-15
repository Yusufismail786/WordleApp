package com.example.wordleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var gameBtn: Button
    private lateinit var rviewBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gameBtn = findViewById(R.id.GameBtn)
        rviewBtn = findViewById(R.id.RviewBtn)
        val username = findViewById<EditText>(R.id.NamePT).toString()

        gameBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, WordleGame::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext, username, Toast.LENGTH_LONG).show()
        }
        rviewBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, RecyclerView::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext, username, Toast.LENGTH_LONG).show()
        }
    }
}