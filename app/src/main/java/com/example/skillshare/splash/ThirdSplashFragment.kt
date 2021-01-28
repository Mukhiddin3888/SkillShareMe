package com.example.skillshare.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.skillshare.R
import kotlinx.android.synthetic.main.fragment_second_splash.view.*
import kotlinx.android.synthetic.main.fragment_third_splash.view.*

class ThirdSplashFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third_splash, container, false)


        view.txv_skip_3.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.favoriteGenresFragment) }


        return view
    }


}