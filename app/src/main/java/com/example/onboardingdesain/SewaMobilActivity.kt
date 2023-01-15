package com.example.onboardingdesain

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SewaMobilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sewa_mobil)

    }

    fun selesaisewa(view: View?) {
        val i = Intent(applicationContext, MetodePembayaranActivity::class.java)
        startActivity(i)

    }
}