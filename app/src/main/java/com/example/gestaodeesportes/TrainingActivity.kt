package com.example.gestaodeesportes

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TrainingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.training_screen)

        val backToHome = findViewById<View>(R.id.backtohome)

        val showless = findViewById<View>(R.id.showless)
        val showmore = findViewById<View>(R.id.showmore)

        val secondrow = findViewById<View>(R.id.secondrow)
        val thirdrow = findViewById<View>(R.id.thirdrow)

        backToHome.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        showless.setOnClickListener {
            secondrow.visibility = View.GONE
            thirdrow.visibility = View.GONE
        }

        showmore.setOnClickListener {
            secondrow.visibility = View.VISIBLE
            thirdrow.visibility = View.VISIBLE
        }

    }
}