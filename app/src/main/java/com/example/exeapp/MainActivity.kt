package com.example.exeapp


import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
    // lateinit var btn_Web:Buton
    // lateinit var btn_Calc:Buton
    // lateinit var btn_Popup:Buton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //btn_Web = findViewById<Button>(R.id.btnWeb)
        //btn_Calc = findViewById<Button>(R.id.btnCalc)
        // btn_Popup = findViewById<Button>(R.id.btnPopup)

        // btnCalc.setOnClickListener{


        val btn_Web = findViewById<Button>(R.id.btnWeb)
        btn_Web.setOnClickListener {
            val intent = Intent(this@MainActivity, WebsiteActivity::class.java)
            startActivity(intent)
        }
        val btn_Calc = findViewById<Button>(R.id.btnCalc)
        btn_Calc.setOnClickListener {
            val intent = Intent(this@MainActivity, CalculatorActivity::class.java)
            startActivity(intent)
        }
        val btn_Popup = findViewById<Button>(R.id.btnPopup)
        btn_Popup.setOnClickListener {
            val alertDialog = AlertDialog(this)
            alertDialog.setTitle("Exiting App")
            alertDialog.setMessage("Are you sure you want to exit?")
            alertDialog.setNegativeButton("No", null)
            alertDialog.setPositiveButton("Yes", DialogInterface.OnClickListener { dialoginterface, which ->
              finish()
            })

            alertDialog.create().show()
        }
    }
}