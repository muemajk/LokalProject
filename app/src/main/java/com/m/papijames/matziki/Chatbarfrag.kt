package com.m.papijames.matziki

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by papi james on 05/02/2018.
 */
class Chatbarfrag : Fragment() {
    companion object {
        fun newInstance(): Chatbarfrag{
            return Chatbarfrag()
        }
    }


    override fun onAttach(context: Context?) {
        super.onAttach(context)

    }
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.chatbar_frag,container,false)
    }
}