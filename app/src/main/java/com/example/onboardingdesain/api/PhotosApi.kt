package com.example.onboardingdesain.api

import com.example.onboardingdesain.model.Photo
import io.reactivex.Single
import retrofit2.http.GET

interface PhotosApi {
    @GET("data")
    fun getPhotos(): Single<List<Photo>>
}
