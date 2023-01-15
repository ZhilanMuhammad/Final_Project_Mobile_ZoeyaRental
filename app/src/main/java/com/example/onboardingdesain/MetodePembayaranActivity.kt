package com.example.onboardingdesain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MetodePembayaranActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_metode_pembayaran)
    }
    fun tekanselesai(view: View?) {
        val i = Intent(applicationContext, PembayaranSelesaiActivity::class.java)
        startActivity(i)

    }
}