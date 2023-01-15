package com.example.onboardingdesain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TwoActivity : AppCompatActivity() {

    var btnNext: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        btnNext = findViewById(R.id.btnNext)


        btnNext?.setOnClickListener {
            startActivity(Intent(this@TwoActivity, ThreeActivity::class.java))
        }

    }

}
