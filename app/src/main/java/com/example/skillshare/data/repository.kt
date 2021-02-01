package com.example.skillshare.data

import androidx.lifecycle.LiveData

class BookRepository(private  val bookDAO: BookDAO) {

    val readAllData: LiveData<List<Book>> = bookDAO.readAllData()

    suspend fun addBook(book: Book){
        bookDAO.addBook(book)
    }
}
