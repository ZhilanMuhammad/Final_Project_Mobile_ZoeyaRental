package com.example.onboardingdesain.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.onboardingdesain.R
import kotlinx.android.synthetic.main.detail_item_list_mobil.*

class DetailMobilActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_item_list_mobil)
        merkmobil.text = intent.getStringExtra("judul")
        hargamobil.text = intent.getStringExtra("harga")
        ratingmobil.text = intent.getStringExtra("rating")



        Glide.with(this)
            .load(intent.getStringExtra("gambar"))
            .into(tvMobil)
    }

}

