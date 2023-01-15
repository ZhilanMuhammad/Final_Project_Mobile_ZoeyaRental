package com.example.onboardingdesain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.onboardingdesain.view.DetailMobilActivity
import com.example.onboardingdesain.view.PhotoListAdapter
import com.example.onboardingdesain.viewmodel.ListViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MobilActivity : AppCompatActivity() {
    lateinit var viewModel: ListViewModel
    private val photoListAdapter = PhotoListAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(ListViewModel::class.java)
        viewModel.fetchData()

        rv_list.apply{
            layoutManager = LinearLayoutManager(context)
            adapter = photoListAdapter
        }
        observeViewModel()
    }

    fun observeViewModel(){
        viewModel.photos.observe(this, Observer{ photos ->
            photos?.let{
                photoListAdapter.updatePhotos(it)
            }
        })
    }

    fun mobilavanza(view: View?) {
        val i = Intent(applicationContext, DetailMobilActivity::class.java)
        startActivity(i)

    }

    fun mobilbrio(view: View?) {
        val i = Intent(applicationContext, DetailMobilActivity::class.java)
        startActivity(i)

    }

    fun mobilrush(view: View?) {
        val i = Intent(applicationContext, DetailMobilActivity::class.java)
        startActivity(i)

    }

    fun mobilterios(view: View?) {
        val i = Intent(applicationContext, DetailMobilActivity::class.java)
        startActivity(i)

    }

    fun mobilcayla(view: View?) {
        val i = Intent(applicationContext, DetailMobilActivity::class.java)
        startActivity(i)

    }

    fun mobildaihatsu(view: View?) {
        val i = Intent(applicationContext, DetailMobilActivity::class.java)
        startActivity(i)

    }

}