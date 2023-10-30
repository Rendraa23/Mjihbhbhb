package com.example.bimbel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 =  findViewById<Button>(R.id.button1)
        button1.setOnClickListener{
            val intent1 = Intent (this, bimbel_tk::class.java)
            startActivity(intent1)
        }

        val button2 =  findViewById<Button>(R.id.button2)
        button2.setOnClickListener{
            val intent1 = Intent (this, bimbel_smp::class.java)
            startActivity(intent1)
        }

        val button3 =  findViewById<Button>(R.id.button3)
        button3.setOnClickListener{
            val intent1 = Intent (this, harga::class.java)
            startActivity(intent1)
        }

        val button4 =  findViewById<Button>(R.id.button4)
        button4.setOnClickListener{
            val intent1 = Intent (this, bimbel_sd::class.java)
            startActivity(intent1)
        }

        val button5 =  findViewById<Button>(R.id.button5)
        button5.setOnClickListener{
            val intent1 = Intent (this, bimbel_sma::class.java)
            startActivity(intent1)
        }

        val button6 =  findViewById<Button>(R.id.button6)
        button6.setOnClickListener{
            val intent1 = Intent (this, daftar::class.java)
            startActivity(intent1)
        }







    }
}