package com.m.papijames.matziki

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.widget.Switch

class HomeActivity : FragmentActivity(), Playerbar.Playerbarinterface {
    override fun onButttonClick(args: Int, args2: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private var switch: Switch? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val userfrag = Userorientedfrag()
        userfrag.arguments = intent.extras
        val transaction =  fragmentManager.beginTransaction()
        transaction.add(R.id.homeLinearview,userfrag)
        transaction.commit()


    }


}







