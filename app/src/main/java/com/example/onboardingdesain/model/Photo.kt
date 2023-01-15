package com.example.onboardingdesain.model

import com.google.gson.annotations.SerializedName

data class Photo(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("Merk")
    val merk: String?,
    @SerializedName("Plat")
    val plat: String?,
    @SerializedName("Rating")
    val rating: String?,
    @SerializedName("Harga")
    val harga: String?,
    @SerializedName("Gambar")
    val gambar: String?

)

//data class Photo(
//    @SerializedName("id")
//    val id: Int?,
//    @SerializedName("title")
//    val title: String?,
//    @SerializedName("thumbnailUrl")
//    val thumbnail: String?
//)
