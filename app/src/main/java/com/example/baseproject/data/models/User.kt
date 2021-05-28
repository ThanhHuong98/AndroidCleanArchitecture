package com.example.baseproject.data.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class User(
    @field:SerializedName("login")
    private val login: String,

    @field:SerializedName("avatar_url")
    private val avatarUrl: String
) : Parcelable
