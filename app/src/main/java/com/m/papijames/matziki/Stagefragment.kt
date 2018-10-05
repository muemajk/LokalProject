package com.m.papijames.matziki

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by papi james on 05/02/2018.
 */
class Stagefragment : Fragment() {
    companion object {
        fun newInstance(): Stagefragment{
            return Stagefragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.stagearea_frag,container,false)
    }
}