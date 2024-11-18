package com.example.gestaodeesportes

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Signup : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        val name = findViewById<View>(R.id.etNome)
        val email = findViewById<View>(R.id.etEmail)
        val password = findViewById<View>(R.id.etSenha)
        val sport = findViewById<View>(R.id.etEsporte)
        val register = findViewById<View>(R.id.btnCadastrar)

        register.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}