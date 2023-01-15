package com.example.onboardingdesain.view

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.onboardingdesain.R
import com.example.onboardingdesain.model.Photo
import kotlinx.android.synthetic.main.item_list.view.*

class PhotoListAdapter(var photos: ArrayList<Photo>):
    RecyclerView.Adapter<PhotoListAdapter.ViewHolder>() {
    fun updatePhotos(newPhotos: List<Photo>){
        photos.clear()
        photos.addAll(newPhotos)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder (parent: ViewGroup, p1: Int) = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
    )

    override fun getItemCount() = photos.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(photos[position])
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        fun bind(photos: Photo){
            val detail :ImageView =itemView.imageview
            val requestOp = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
            itemView.tvTitle.text = photos.merk
            itemView.plat.text = photos.plat
            itemView.rating.text = photos.rating
            itemView.harga.text = photos.harga
           // itemView.hargabrio.text = photos.harga

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailMobilActivity::class.java)
                intent.putExtra("judul",photos.merk)
                intent.putExtra("harga",photos.harga)
                intent.putExtra("rating",photos.rating)
                intent.putExtra("gambar",photos.gambar)
                itemView.context.startActivity(intent)
            }
            val urGambar=photos.gambar
            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOp)
                .load("$urGambar.png")
                .into(detail)
        }
    }
}