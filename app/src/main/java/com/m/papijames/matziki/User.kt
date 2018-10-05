package com.m.papijames.matziki

/**
 * Created by papi james on 07/02/2018.
 */
data class User (

    private val username:String,
    private  val following:Int ,
    private val followers : Int ,

    private val location : String,
    private val bio : String,
    private val link : String,

    private val profilepic : String,
    private val info : String



)