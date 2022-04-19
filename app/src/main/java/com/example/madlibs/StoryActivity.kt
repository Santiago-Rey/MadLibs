package com.example.madlibs


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class StoryActivity : AppCompatActivity() {
    var count = 0;
 // var word = Words() //instancia un objeto nuevo
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)

        Words.safeWords
        Words.listWords
        showFile()

    }

    fun showFile() {

        val scan = Scanner(
            resources.openRawResource( //abre un recurso de la carpeta raw
                resources.getIdentifier("story_one","raw", packageName ) //Identificando el recurso qeu va a traer
            )
        )
        var allText = ""//Aqui se acumula la historia que va leyendo del archivo
        while (scan.hasNextLine()) {
            val line = scan.nextLine()
            allText += line
        }

        scan.close()

        val textS = findViewById<TextView>(R.id.storyText) // Mostramos el archivo en el textView
        textS.text = allText








            val newContent: String  = allText.replace(Words.listWords[1], Words.safeWords[1])
            textS.text = newContent




        textS.text

    }

}



