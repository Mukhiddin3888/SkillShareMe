package com.example.skillshare.splash


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.skillshare.R
import kotlinx.android.synthetic.main.fragment_first_splash.view.*


class firstSplash : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_first_splash, container, false)


        view.txv_skip_1.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.secondSplashFragment)}


        return view
    }


}