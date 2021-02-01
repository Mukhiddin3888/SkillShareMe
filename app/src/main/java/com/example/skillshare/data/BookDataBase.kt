package com.example.skillshare.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Book::class],version = 1, exportSchema = false)
abstract class BookDataBase:RoomDatabase() {

    abstract fun bookDao():BookDAO


    companion object{

        @Volatile
        private var INSTANCE: BookDataBase? = null

        fun getDatabase(context: Context): BookDataBase{
            val tempInstance  = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    BookDataBase::class.java,
                    "books_db"
                ).build()
                INSTANCE = instance

                return instance
            }
        }


    }
}