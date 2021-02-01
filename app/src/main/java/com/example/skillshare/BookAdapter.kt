package com.example.skillshare

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.skillshare.data.Book
import kotlinx.android.synthetic.main.book_item_layout.view.*
import kotlinx.android.synthetic.main.fragment_add_book.view.*

class BookAdapter :RecyclerView.Adapter<BookAdapter.MyViewHolder>(){

    private var bookList= emptyList<Book>()

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
    return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.book_item_layout, parent , false ))
    }

    override fun getItemCount(): Int {
    return bookList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = bookList[position]

       holder.itemView.txv_title.text = currentItem.title
        holder.itemView.txv_author.text = currentItem.author

    }
    fun setData(book: List<Book>){

        this.bookList = book
        notifyDataSetChanged()
    }


}