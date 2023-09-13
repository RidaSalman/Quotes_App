package com.example.livedata

import androidx.lifecycle.LiveData

class QuoteRepository(private val quoteDao: QuoteDAO) {

    fun getQuotes(): LiveData<List<Quote>> {
        return quoteDao.getQuotes()
    }

    suspend fun insertQuote(quote: Quote){
        quoteDao.insertQuote(quote)
    }
}