package com.m.papijames.matziki


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by papi james on 04/02/2018.
 */
class Playerbar : Fragment() {


    companion object {
        fun newInstance(): Playerbar{
            return Playerbar()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.playerbarfrag,container,false)
    }


    var activityCallback: Playerbar.Playerbarinterface? = null

    interface Playerbarinterface{

        fun onButttonClick(fontsize: Int, text: String )
    }
    override fun onAttach(context: Context?) {
        super.onAttach(context)

        try{
            activityCallback = context as Playerbarinterface

        }catch (e : ClassCastException){
            throw ClassCastException(context?.toString()+ "must implement Playbarinterface")
        }
    }
}