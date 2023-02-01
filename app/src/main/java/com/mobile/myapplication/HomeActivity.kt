package com.mobile.myapplication

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.time.LocalDate.now

class HomeActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        textViewFecha()
        botonDesplegable()
        botonConfiguration()
    }


    @RequiresApi(Build.VERSION_CODES.O)
    private fun textViewFecha(){
        val text1 = findViewById<TextView>(R.id.idTVDate)
        text1.text = now().toString()
    }

    private fun botonConfiguration(){
        val button1 = findViewById<Button>(R.id.boton_configuracion)
        button1.setOnClickListener {
            val intent1 = Intent(this, AccountActivity::class.java)
            startActivity(intent1)
        }
    }

    private fun botonDesplegable(){
        val button1 = findViewById<Button>(R.id.boton_desplegable)
        button1.setOnClickListener {

            val dialogBuilder = AlertDialog.Builder(this)

            dialogBuilder.setMessage("What do you want to create?")

                .setCancelable(true)



                .setPositiveButton("Diary", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                        val intent1 = Intent(this, DiaryActivity::class.java)
                        startActivity(intent1)
                })

                .setNegativeButton("Event", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                        val intent2 = Intent(this, EventActivity::class.java)
                        startActivity(intent2)
                })

            val alert = dialogBuilder.create()
            alert.setTitle("Create")
            alert.show()
        }
    }

    private fun botonEvent(){
        val button1 = findViewById<Button>(R.id.register)
        button1.setOnClickListener {

        }
    }

    private fun botonDiary(){
        val button1 = findViewById<Button>(R.id.register)
        button1.setOnClickListener {
            val intent1 = Intent(this, RegisterActivity::class.java)
            startActivity(intent1)
        }
    }
}


