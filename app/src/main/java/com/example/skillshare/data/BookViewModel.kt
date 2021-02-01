package com.example.skillshare.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import androidx.room.Insert
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BookViewModel(application: Application):AndroidViewModel(application) {

     val readAllData: LiveData<List<Book>>
    private val repository:BookRepository
    init {
        val bookDAO =BookDataBase.getDatabase(application).bookDao()

        repository = BookRepository(bookDAO)

        readAllData = repository.readAllData


    }

    fun addBook(book: Book){
        viewModelScope.launch (Dispatchers.IO){
            repository.addBook(book)
        }
    }

}