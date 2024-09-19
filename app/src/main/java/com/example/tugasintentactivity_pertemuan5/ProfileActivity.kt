package com.example.tugasintentactivity_pertemuan5

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugasintentactivity_pertemuan5.databinding.ActivityProfileBinding
import org.w3c.dom.Text

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    private lateinit var textviewUsername: TextView
    private lateinit var textviewEmail: TextView
    private lateinit var textviewPhone: TextView
    private lateinit var textviewGender: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        textviewUsername = findViewById(R.id.txt_username)
        textviewEmail = findViewById(R.id.txt_email)
        textviewPhone = findViewById(R.id.txt_nohp)
        textviewGender = findViewById(R.id.txt_gender)

        val username = intent.getStringExtra("USERNAME") ?: "Tidak ada data"
        val email = intent.getStringExtra("EMAIL") ?: "Tidak ada data"
        val phone = intent.getStringExtra("PHONE") ?: "Tidak ada data"
        val gender = intent.getStringExtra("GENDER") ?: "Tidak ada data"


        textviewUsername.text   = "Username : $username"
        textviewEmail.text      = "Email : $email"
        textviewPhone.text      = "No Hp : $phone"
        textviewGender.text     = "Gender : $gender"


    }
}