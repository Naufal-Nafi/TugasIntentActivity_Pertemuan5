package com.example.tugasintentactivity_pertemuan5

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugasintentactivity_pertemuan5.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var editUsername: EditText
    private lateinit var editEmail: EditText
    private lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        editUsername = findViewById(R.id.edit_username)
        editEmail = findViewById(R.id.edit_email)
        buttonLogin = findViewById(R.id.button_login)

        val regUsername = intent.getStringExtra("USERNAME")
        val regEmail = intent.getStringExtra("EMAIL")
        val regPhone = intent.getStringExtra("PHONE")
        val regGender = intent.getStringExtra("GENDER")


        with(binding){
            buttonLogin.setOnClickListener {
                val username = editUsername.text.toString()
                val email = editEmail.text.toString()

                if (username == regUsername && email == regEmail) {
                    val intent = Intent(this@LoginActivity, ProfileActivity::class.java)
                    intent.putExtra("USERNAME", regUsername)
                    intent.putExtra("EMAIL", regEmail)
                    intent.putExtra("PHONE", regPhone)
                    intent.putExtra("GENDER", regGender)
                    startActivity(intent)
                    finish()
                } else {
                    Toast.makeText(this@LoginActivity, "Username atau email salah", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}