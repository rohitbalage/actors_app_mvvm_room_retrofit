package com.rrbofficial.retrofit

import com.rrbofficial.retrofit.Character
import retrofit2.http.GET

interface CharacterAPi {
    @GET("characters")   // END POINT  we used last end point you can use both /api/characters
    suspend fun  getCharacters(): List<Character>

}