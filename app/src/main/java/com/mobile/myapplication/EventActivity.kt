package com.mobile.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar

class EventActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event)
        botonSalir()
    }

    private fun botonSalir(){
        val button1= findViewById<Button>(R.id.return_button)
        button1.setOnClickListener {
            val carga= findViewById<ProgressBar>(R.id.loading)
            carga.visibility = View.VISIBLE
            finish()
        }
    }
}