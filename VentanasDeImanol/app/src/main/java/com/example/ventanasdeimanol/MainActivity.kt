package com.example.ventanasdeimanol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Intent
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var txtNombre: EditText
    private lateinit var btnAceptar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Obtenemos una referencia a los controles de la interfaz
        txtNombre = findViewById(R.id.txtNombre)
        btnAceptar = findViewById(R.id.btnAceptar)

        //Implementamos el evento click del botón
        btnAceptar.setOnClickListener {

            //Creamos el intent
            val intent = Intent(this@MainActivity, SaludoActivity::class.java)

            //Creamos la información a pasar entre actividades
            val b = Bundle()
            b.putString("NOMBRE", txtNombre.text.toString())

            //Añadimos la información al intent
            intent.putExtras(b)

            //Iniciamos la nueva actividad
            startActivity(intent)
        }
    }
}