package com.example.registration

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val details = findViewById<TextView>(R.id.tvDetails)

        val name = intent.getStringExtra("name")
        val age = intent.getStringExtra("age")
        val email = intent.getStringExtra("email")
        val phone = intent.getStringExtra("phone")
        val gender = intent.getStringExtra("gender")

        details.text = """
Name: $name
Age: $age
Email: $email
Phone: $phone
Gender: $gender
        """.trimIndent()
    }
}