package com.example.skillshare.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "books_db")
data class Book (

    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val title: String,
    val author: String

)