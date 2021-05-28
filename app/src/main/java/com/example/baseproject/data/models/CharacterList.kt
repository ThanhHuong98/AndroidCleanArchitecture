package com.example.baseproject.data.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class CharacterList(
    @field:SerializedName("results")
    val characterList: List<Character> = emptyList()
) : Parcelable