package com.rrbofficial.retrofit

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Character (

    @Json(name = "actor")
    val actor: String,

    @Json(name = "image")   // Moshi  JSON Annotation. in order to understand well and be serialized faster.
    val image: String


)