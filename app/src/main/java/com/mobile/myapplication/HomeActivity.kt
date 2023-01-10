package com.mobile.myapplication

import android.app.AlertDialog
import android.content.DialogInterface
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
    }


    @RequiresApi(Build.VERSION_CODES.O)
    private fun textViewFecha(){
        val text1 = findViewById<TextView>(R.id.idTVDate)
        text1.text = now().toString()
    }

    private fun botonDesplegable(){
        val button1 = findViewById<Button>(R.id.boton_desplegable)
        button1.setOnClickListener {

            val dialogBuilder = AlertDialog.Builder(this)

            dialogBuilder.setMessage("Do you want to create a new Event or Task ?")

                .setCancelable(false)

                .setNeutralButton("Cancel", DialogInterface.OnClickListener {
                        dialog, id -> finish()
                })

                .setPositiveButton("Task", DialogInterface.OnClickListener {
                        dialog, id -> finish()
                })

                .setNegativeButton("Event", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()
            alert.setTitle("Create")
            alert.show()
        }
    }
}


