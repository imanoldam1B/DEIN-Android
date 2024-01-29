package com.example.ventanasdeimanol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SaludoActivity : AppCompatActivity() {

    private lateinit var txtSaludo: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)

        //Localizar los controles
        txtSaludo = findViewById(R.id.txtSaludo)

        //Recuperamos la información pasada en el intent
        val bundle = intent.extras

        //Construimos el mensaje a mostrar
        txtSaludo.text = "Hola ${bundle?.getString("NOMBRE")}"
    }
}