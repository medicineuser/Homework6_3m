package com.geeks.homework6_3m

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geeks.homework6_3m.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().add(R.id.container, AnimalFragment()).commit()
    }
}