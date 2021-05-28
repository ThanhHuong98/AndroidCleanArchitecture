package com.example.baseproject.data.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class Character(

    @field:SerializedName("name")
    private val name: String = "",

    @field:SerializedName("id")
    private val id: Int,

    @field:SerializedName("status")
    private val status: String = "",

    @field:SerializedName("gender")
    private val gender: String = "",

    @field:SerializedName("image")
    private val image: String = ""
) : Parcelable {

    fun getName() = name

    fun getStatus() = status

    fun getGender() = gender

    fun getImage() = image

}