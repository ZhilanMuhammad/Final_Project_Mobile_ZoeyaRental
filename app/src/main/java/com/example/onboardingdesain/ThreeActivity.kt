package com.example.onboardingdesain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThreeActivity : AppCompatActivity() {

    var btnStart: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        btnStart = findViewById(R.id.btnStart)

        btnStart?.setOnClickListener {
            startActivity(Intent(this@ThreeActivity, RegisterActivity::class.java))
        }

    }
}
