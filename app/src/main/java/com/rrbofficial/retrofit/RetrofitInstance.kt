package com.rrbofficial.retrofit

import com.squareup.moshi.Moshi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create


//  why you use objects?

/*
*   IN kotlin Object declarations are used  to delcare singalton objects,
*     singleton patten  package ensure that one and only one instance of package
*     is created. has one global poient of object to that access.
/
 */

object RetrofitInstance {


    fun provideApi (builder: Retrofit.Builder) : CharacterAPi
    {
    return builder.build()
        .create(CharacterAPi::class.java)
    }

    fun provideRetrofit() : Retrofit.Builder{
        return Retrofit.Builder()
            .baseUrl("https://hp-api.onrender.com/api/")
            .addConverterFactory(MoshiConverterFactory.create())
    }

}