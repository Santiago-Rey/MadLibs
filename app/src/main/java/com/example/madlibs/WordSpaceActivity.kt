package com.example.madlibs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class WordSpaceActivity : AppCompatActivity() {

    var count = 0;
    lateinit var typeWord : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_space)

        val buttomStory = findViewById<Button>(R.id.btnOk)
        typeWord =  findViewById(R.id.textBox)
        typeWord.hint = Words.listWords[count] //trae de la lista el elemento que se encuentra en esa posicion, y inicia mostrando una palabra

        buttomStory.setOnClickListener {



            if(typeWord.text.isNotEmpty()){//Si hay escrita un palabra entra

                Words.safeWords.add(typeWord.text.toString())//Guardando las palabras que vamos escribiendo
                count ++
                typeWord.hint = Words.listWords.getOrElse(count){""} //Aqui ya entra despues del click
                typeWord.setText("")

            }

            if(count == Words.listWords.size ){

                story()

            }

        }


    }

    fun story() {

        val intent = Intent(this, StoryActivity::class.java)
        startActivity(intent)

    }


}