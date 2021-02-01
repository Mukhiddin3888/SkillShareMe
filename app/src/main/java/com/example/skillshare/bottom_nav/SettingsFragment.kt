package com.example.skillshare.bottom_nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.skillshare.R
import kotlinx.android.synthetic.main.fragment_settings.view.*

class SettingsFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_settings, container, false)


        view.btn_set_addBook.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.addBookFragment)}
        view.btn_go_back.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.homeFragment)}



        return view
    }


}