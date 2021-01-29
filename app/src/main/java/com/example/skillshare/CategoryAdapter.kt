package com.example.skillshare


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_genres_item_template.view.*
import kotlinx.android.synthetic.main.fragment_home.view.*


class CategoryAdapter(val categories: List<CategoriesModel>) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.fragment_genres_item_template,parent,false)

        )
    }

    override fun getItemCount() = categories.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = categories[position]

        holder.view.btn_categories.text = category.name
        holder.view.btn_categories.background = category.imageName

    }
    class CategoryViewHolder(val view: View) : RecyclerView.ViewHolder(view){

    }

}