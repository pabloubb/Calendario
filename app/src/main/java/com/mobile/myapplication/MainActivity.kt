package com.mobile.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        botonRegister()
        botonLogIn()
    }

    private fun botonRegister(){
        val button1 = findViewById<Button>(R.id.register)
        button1.setOnClickListener {
            val intent1 = Intent(this, RegisterActivity::class.java)
            startActivity(intent1)
        }
    }

    private fun botonLogIn(){
        val button2 = findViewById<Button>(R.id.login)
        val carga= findViewById<ProgressBar>(R.id.loading)
        button2.setOnClickListener {
            val intent2 = Intent(this, HomeActivity::class.java)
            startActivity(intent2)
        }
    }
}