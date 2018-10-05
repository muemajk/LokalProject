package com.m.papijames.matziki

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by papi james on 04/02/2018.
 */
class Matatuorientedfrag : Fragment() {

    private lateinit var linearLayoutManager:LinearLayoutManager
    companion object {
        fun newInstance(): Matatuorientedfrag{
            return Matatuorientedfrag()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.matatuorientedfrag,container,false)

        //linearLayoutManager=LinearLayoutManager(this)
        //matorientview.layoutManager= linearLayoutManager

    }

}