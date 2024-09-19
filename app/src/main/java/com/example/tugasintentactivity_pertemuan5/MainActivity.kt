package com.example.tugasintentactivity_pertemuan5

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugasintentactivity_pertemuan5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var editUsername: EditText
    private lateinit var editEmail: EditText
    private lateinit var editPhone: EditText
    private lateinit var editGender: EditText
    private lateinit var buttonReg: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        editUsername = findViewById<EditText>(R.id.edit_username)
        editUsername = findViewById(R.id.edit_username)
        editEmail = findViewById(R.id.edit_email)
        editPhone = findViewById(R.id.edit_nohp)
        editGender = findViewById(R.id.edit_gender)
        buttonReg = findViewById(R.id.button_reg)

        with(binding) {
            buttonReg.setOnClickListener {
                val username = editUsername.text.toString()
                val email = editEmail.text.toString()
                val nohp = editPhone.text.toString()
                val gender = editGender.text.toString()

                val intent = Intent(this@MainActivity, LoginActivity::class.java)
                intent.putExtra("USERNAME", username)
                intent.putExtra("EMAIL", email)
                intent.putExtra("PHONE", nohp)
                intent.putExtra("GENDER", gender)
                startActivity(intent)
            }
        }
    }
}