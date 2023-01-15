package com.example.onboardingdesain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }

    fun backhome(view: View?) {
        val i = Intent(applicationContext, DashboardActivity::class.java)
        startActivity(i)
    }
}