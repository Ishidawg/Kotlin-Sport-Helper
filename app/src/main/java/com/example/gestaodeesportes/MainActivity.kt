package com.example.gestaodeesportes

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val performanceButton = findViewById<View>(R.id.performance)
        val scheduleButton = findViewById<View>(R.id.events)

        performanceButton.setOnClickListener {
            // Inicia a TrainingActivity usando Intent
            val intent = Intent(this, TrainingActivity::class.java)
            startActivity(intent)
        }

        scheduleButton.setOnClickListener {
            // Inicia a ScheduleActivity usando Intent
            val intent = Intent(this, ScheduleActivity::class.java)
            startActivity(intent)
        }
    }
}