package com.example.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {
    fun getQuotes() : LiveData<List<Quote>>{
        return quoteRepository.getQuotes()

    }

    suspend fun insertQuote(quote: Quote){
        quoteRepository.insertQuote(quote)
    }

}