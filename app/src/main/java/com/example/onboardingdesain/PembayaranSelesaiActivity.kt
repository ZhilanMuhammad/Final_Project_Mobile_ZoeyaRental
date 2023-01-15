package com.example.onboardingdesain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PembayaranSelesaiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembayaran_selesai)
    }

    fun selesaipembayaran(view: View?) {
        val i = Intent(applicationContext, ListDataActivity::class.java)
        startActivity(i)

    }

}