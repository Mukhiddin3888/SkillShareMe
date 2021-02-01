package com.example.skillshare.bottom_nav

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.skillshare.BookAdapter
import com.example.skillshare.CategoriesModel
import com.example.skillshare.CategoryAdapter
import com.example.skillshare.R
import com.example.skillshare.data.BookViewModel
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {

    private lateinit var mBooksViewModel: BookViewModel

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val categories = listOf(
                CategoriesModel("Fantasy",resources.getDrawable(R.drawable.rectangle_1)),
                CategoriesModel("Thriller",resources.getDrawable(R.drawable.rectangle_2)),
                CategoriesModel("Romance",resources.getDrawable(R.drawable.rectangle_3)),
                CategoriesModel("Science fiction",resources.getDrawable(R.drawable.rectangle_4)),
                CategoriesModel("Literature",resources.getDrawable(R.drawable.rectangle_5)),
                CategoriesModel("Action",resources.getDrawable(R.drawable.rectangle_6)),
                CategoriesModel("Biography",resources.getDrawable(R.drawable.rectangle_7)),
                CategoriesModel("Others",resources.getDrawable(R.drawable.rectangle_8))

        )

        view.recyclerView.layoutManager = LinearLayoutManager(this.context,LinearLayoutManager.HORIZONTAL,false)
        view.recyclerView.adapter = CategoryAdapter(categories)



        //recyclrView
        val adapter = BookAdapter()
        val recyclerView = view.recViewBooks
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)


            // ViewModel
        mBooksViewModel = ViewModelProvider(this).get(BookViewModel::class.java)
        mBooksViewModel.readAllData.observe(viewLifecycleOwner, Observer {book->

            adapter.setData(book)


        })



        return view
    }

}