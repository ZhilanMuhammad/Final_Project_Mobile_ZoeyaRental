package com.example.onboardingdesain

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.onboardingdesain.view.DetailMobilActivity

class ListDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_data)

    }

    fun tambahpenyewa(view: View?) {
        val i = Intent(applicationContext, SewaMobilActivity::class.java)
        startActivity(i)
    }

    fun kembaliberanda(view: View?) {
        val i = Intent(applicationContext, DashboardActivity::class.java)
        startActivity(i)
    }

}