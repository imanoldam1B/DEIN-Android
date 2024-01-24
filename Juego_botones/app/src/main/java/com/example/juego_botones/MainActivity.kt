package com.example.juego_botones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    private val numBotones = 10
    private lateinit var llBotonera: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llBotonera = findViewById(R.id.llBotonera)

        //Creamos las propiedades de layout que tendrán los botones.
        val lp = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        //Creamos los botones en bucle
        for (i in 0 until numBotones) {
            val button = Button(this)
            //Asignamos propiedades de layout al botón
            button.layoutParams = lp
            //Asignamos Texto al botón
            button.text = "Botón " + String.format("%02d", i)
            llBotonera.addView(button)
        }
    }
}