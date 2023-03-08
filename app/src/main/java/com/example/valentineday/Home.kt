package com.example.valentineday

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.valentineday.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    private lateinit var binding : ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.cardHistory.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://en.wikipedia.org/wiki/Valentine%27s_Day")
            startActivity(intent)
        }

        binding.cardMessage.setOnClickListener {
            val intent = Intent(this, Message::class.java)
            startActivity(intent)
        }

        binding.button.setOnClickListener {
            val intent = Intent(this, Splash::class.java)
            startActivity(intent)
        }
    }
}