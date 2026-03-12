package com.example.registrationapp

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.etName)
        val age = findViewById<EditText>(R.id.etAge)
        val email = findViewById<EditText>(R.id.etEmail)
        val phone = findViewById<EditText>(R.id.etPhone)
        val genderGroup = findViewById<RadioGroup>(R.id.rgGender)
        val submit = findViewById<Button>(R.id.btnSubmit)

        submit.setOnClickListener {

            val selectedId = genderGroup.checkedRadioButtonId
            val gender = findViewById<RadioButton>(selectedId).text.toString()

            val intent = Intent(this, DisplayActivity::class.java)

            intent.putExtra("name", name.text.toString())
            intent.putExtra("age", age.text.toString())
            intent.putExtra("email", email.text.toString())
            intent.putExtra("phone", phone.text.toString())
            intent.putExtra("gender", gender)

            startActivity(intent)
        }
    }
}