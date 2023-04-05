package com.example.firebasecrashlytics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firebasecrashlytics.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.image.setOnClickListener {
            throw IllegalStateException("Crashlytics ni sinash uchun yozilgan xatolik")
        }
    }
}