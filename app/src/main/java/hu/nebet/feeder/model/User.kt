package hu.nebet.feeder.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class User(
    val userId: String,
    val userName: String)
