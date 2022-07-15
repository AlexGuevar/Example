package com.killacorp.example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.killacorp.example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var layout: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        layout = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(layout.root)
        layout.button.setOnClickListener {
            startActivity(
                Intent(this,HomeActivity::class.java)
            )
        }
    }
}