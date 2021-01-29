package com.example.skillshare.splash

import android.content.Intent
import android.graphics.Color.parseColor
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import com.example.skillshare.MainActivity2
import com.example.skillshare.R
import kotlinx.android.synthetic.main.fragment_favorite_genres.*
import kotlinx.android.synthetic.main.fragment_favorite_genres.view.*

class FavoriteGenresFragment : Fragment() {
    var choosen:Boolean= false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_favorite_genres, container, false)

        view.btn_fantasy.setOnClickListener{
            if (choosen == false){
                btn_fantasy.setTextColor(parseColor("#F16F54"))

                choosen = true
            }else{
                btn_fantasy.setTextColor(parseColor("#FFFFFF"))
                choosen = false
            }
        }

        view.btn_thriller.setOnClickListener{
            if (choosen == false){
                btn_thriller.setTextColor(parseColor("#F16F54"))

                choosen = true
            }else{
                btn_thriller.setTextColor(parseColor("#FFFFFF"))
                choosen = false
            }
        }

        view.btn_romans.setOnClickListener{
            if (choosen == false){
                btn_romans.setTextColor(parseColor("#F16F54"))

                choosen = true
            }else{
                btn_romans.setTextColor(parseColor("#FFFFFF"))
                choosen = false
            }
        }

        view.btn_science.setOnClickListener{
            if (choosen == false){
                btn_science.setTextColor(parseColor("#F16F54"))

                choosen = true
            }else{
                btn_science.setTextColor(parseColor("#FFFFFF"))
                choosen = false
            }
        }

        view.btn_others.setOnClickListener{
            if (choosen == false){
                btn_others.setTextColor(parseColor("#F16F54"))

                choosen = true
            }else{
                btn_others.setTextColor(parseColor("#FFFFFF"))
                choosen = false
            }
        }

        view.btn_action.setOnClickListener{
            if (choosen == false){
                btn_action.setTextColor(parseColor("#F16F54"))

                choosen = true
            }else{
                btn_action.setTextColor(parseColor("#FFFFFF"))
                choosen = false
            }
        }

        view.btn_biography.setOnClickListener{
            if (choosen == false){
                btn_biography.setTextColor(parseColor("#F16F54"))

                choosen = true
            }else{
                btn_biography.setTextColor(parseColor("#FFFFFF"))
                choosen = false
            }
        }

        view.btn_literature.setOnClickListener{
            if (choosen == false){
                btn_literature.setTextColor(parseColor("#F16F54"))

                choosen = true
            }else{
                btn_literature.setTextColor(parseColor("#FFFFFF"))
            choosen = false
        }
        }

        view.btn_letsStart.setOnClickListener{
            val intent = Intent (getActivity(), MainActivity2::class.java)
            getActivity()?.startActivity(intent)
            activity?.finish()

        }

        return view
    }


}