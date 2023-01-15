package com.example.onboardingdesain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DashboardActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }

    fun profile(view: View?) {
        val i = Intent(applicationContext, ProfileActivity::class.java)
        startActivity(i)

    }

    fun informasi(view: View?) {
        val i = Intent(applicationContext, AboutActivity::class.java)
        startActivity(i)
    }

    fun mobil(view: View?) {
        val i = Intent(applicationContext, MobilActivity::class.java)
        startActivity(i)
    }

    fun order(view: View?) {
        val i = Intent(applicationContext, ListDataActivity::class.java)
        startActivity(i)
    }

    fun histori(view: View?) {
        val i = Intent(applicationContext, ListDataActivity::class.java)
        startActivity(i)
    }
}
