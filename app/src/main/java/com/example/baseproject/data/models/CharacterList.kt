package com.example.baseproject.data.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CharacterList(
    @field:SerializedName("results")
    private val characterList: List<Character> = emptyList()
) : Parcelable