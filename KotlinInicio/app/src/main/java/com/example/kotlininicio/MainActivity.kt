
package com.example.kotlininicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cuadroEntrada : EditText = findViewById(R.id.textoEntrada)
        val miBoton : Button = findViewById(R.id.boton)
        val cuadroSalida : TextView = findViewById(R.id.TextoSalida)

        miBoton.setOnClickListener{
            var textoIntro = cuadroEntrada.text.toString();
            cuadroSalida.text = textoIntro;
            cuadroEntrada.text.clear()
        }
    }
}