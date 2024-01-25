package com.example.juego_botones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val numBotones = 10
    private lateinit var llBotonera: LinearLayout
    private var indiceBotonUnico: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llBotonera = findViewById(R.id.llBotonera)

        val lp = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            resources.getDimensionPixelSize(R.dimen.button_height)
        )

        indiceBotonUnico = Random.nextInt(0, numBotones)

        for (i in 0 until numBotones) {
            val button = Button(this)
            button.layoutParams = lp
            button.text = "Botón " + String.format("%02d", i)
            button.setOnClickListener(buttonClickListener(i))
            llBotonera.addView(button)
        }
    }
    private fun buttonClickListener(index: Int): View.OnClickListener {
        return View.OnClickListener {
            if (index == indiceBotonUnico) {
                Toast.makeText(this@MainActivity,
                    "ME ENCONTRASTE!!",
                    Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@MainActivity,
                    "Sigue buscando",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}