package com.m.papijames.matziki

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by papi james on 05/02/2018.
 */
class Chatfrag : Fragment() {
    companion object {
        fun newInstance():Chatfrag{
            return Chatfrag()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.chat_frag,container,false)
    }
}