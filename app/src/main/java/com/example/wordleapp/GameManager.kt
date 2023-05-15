package com.example.wordleapp

import kotlin.random.Random

class GameManager
{
    private lateinit var wordtoguess : String
    val items = ListClass()

    fun pickword() : String {
        val randomword = Random.nextInt(0,items.itemsList.size)
        wordtoguess = items.itemsList[randomword]
        return wordtoguess
    }

}