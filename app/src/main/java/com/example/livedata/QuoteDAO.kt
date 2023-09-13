package com.example.livedata

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.Query

interface QuoteDAO { //Crud operations waly functions dao ma hoty ha

     @Query("SELECT * from quote")
    fun getQuotes() :LiveData<List<Quote>>

    @Insert
    suspend fun insertQuote(quote: Quote)



}