package com.zuri.funfacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val login_button = findViewById<MaterialButton>(R.id.login_button)
        login_button.setOnClickListener{
            val email_text = findViewById<TextInputEditText>(R.id.email_text)
            val email = email_text.text.toString()
            val password_text = findViewById<TextInputEditText>(R.id.password_text)
            val password = password_text.text.toString()

            if (email.toString().isNullOrEmpty() || password.toString().isNullOrEmpty()){
                Toast.makeText(this,"Please Enter Email and Password", Toast.LENGTH_SHORT).show()
            } else {
                if (email.toString() == "vicksoson@zuri.com" && password.toString() == "123456"){
                    val intent = Intent(this, Dashboard::class.java)
                    startActivity(intent)
                    Toast.makeText(this,"Welcome Back victor!", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this,"Email not Recognized", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
}