package com.example.baseproject.data.api.base

import com.google.gson.annotations.SerializedName
import java.net.HttpURLConnection

data class BaseResponse<T>(
    @field:SerializedName("errorCode")
    val errorCode: String? = "",
    @field:SerializedName("message")
    val message: String? = "",
    @field:SerializedName("status")
    val status: Int = -1,
    var data: T
) {
    fun isSuccess(): Boolean {
        return status == HttpURLConnection.HTTP_OK
    }

    companion object Factory {
        fun <T> success(t: T) : BaseResponse<T> {
            return BaseResponse(status = HttpURLConnection.HTTP_OK, data = t)
        }
    }
}
