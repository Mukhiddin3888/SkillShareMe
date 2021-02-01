package com.example.skillshare

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.skillshare.data.Book
import com.example.skillshare.data.BookViewModel
import kotlinx.android.synthetic.main.fragment_add_book.*
import kotlinx.android.synthetic.main.fragment_add_book.view.*

class addBookFragment : Fragment() {

    private lateinit var mBookViewModel: BookViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add_book, container, false)

        mBookViewModel = ViewModelProvider(this).get(BookViewModel::class.java)



        view.btn_addBook.setOnClickListener {

            insertDataToDataBase()

        }

        return view
    }

    private fun insertDataToDataBase() {

        val title = edt_bookName.text.toString()
        val authorName = edt_AuthorName.text.toString()


        if (inputCheck(title,authorName)){

        val book = Book(0,title,authorName)

            mBookViewModel.addBook(book)
            Toast.makeText(requireContext(),"Succesfully added new book",Toast.LENGTH_LONG).show()

            findNavController().navigate(R.id.homeFragment)
        }else{
            Toast.makeText(requireContext(),"Please fill all sets",Toast.LENGTH_LONG).show()

        }


    }

    private fun inputCheck(title: String, authorName: String): Boolean {

        if (title.isEmpty()){
            return false
        }
        if (authorName.isEmpty()){
            return false
        }
        return true

    }

}