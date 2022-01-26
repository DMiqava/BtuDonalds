package com.example.a52finaluri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class order_activity : AppCompatActivity() {
    private lateinit var address : EditText
    private lateinit var ordernow : Button
    private lateinit var back : Button
    private lateinit var credcard : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        address = findViewById(R.id.adress)
        ordernow = findViewById(R.id.orderbtn)
        back = findViewById(R.id.backapp)
        credcard = findViewById(R.id.card)



        ordernow.setOnClickListener {
            var adresi = address.text.toString()
            var carduser = credcard.text.toString()

            if (carduser.isEmpty() || carduser.length <16 ) {
                Toast.makeText(this, "Input Valid Cred Card Info", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (adresi.isEmpty() || adresi.length < 3) {
                Toast.makeText(this, "Please Enter Correct Auditorium", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            else
                Toast.makeText(this, "Your Order Is On It's Way", Toast.LENGTH_SHORT).show()

        }

        back.setOnClickListener {
            val intent = Intent(this, MainActivityMenu::class.java)
            startActivity(intent)
        }




    }
}
