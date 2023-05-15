package com.example.wordleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast

class WordleGame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wordle_game)
        val g = GameManager()
        val guessword = g.pickword()
        val userguess: String = findViewById<EditText>(R.id.WordET).toString()
        if(guessword == userguess)
        {
            Toast.makeText(this,"Correct!", Toast.LENGTH_SHORT).show()
        }else
        {
            Toast.makeText(this,userguess + " is Incorrect!", Toast.LENGTH_SHORT).show();
        }

    }
}