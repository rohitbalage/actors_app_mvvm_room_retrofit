package com.rrbofficial.repository

import com.rrbofficial.retrofit.Character
import com.rrbofficial.retrofit.CharacterAPi

class CharacterRepo(private val characterApi: CharacterAPi) {
    // Repository can gather data from different data source
    // different REST APIs, cache, local database storage
    // and it provides this data to the rest of the app.


    suspend fun  getCharacters() : List<Character>
    {
    return characterApi.getCharacters()
    }



}