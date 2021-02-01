package com.example.skillshare.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface BookDAO {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
   suspend fun addBook(book: Book)


    @Query("SELECT * FROM books_db ORDER BY id ASC")
    fun readAllData(): LiveData<List<Book>>


}