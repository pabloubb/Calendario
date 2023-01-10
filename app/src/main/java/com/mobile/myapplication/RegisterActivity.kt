package com.mobile.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        botonSalir()
    }

    private fun botonSalir(){
        val button1= findViewById<Button>(R.id.return_button)
        button1.setOnClickListener {
            finish()
        }
    }
}