package com.m.papijames.matziki

import java.sql.Time

/**
 * Created by papi james on 07/02/2018.
 */
data class Music (
        private val name :String,
        private  val album : String ,
        private val playlist: String,
        private val clipart: String ,
        private val content : String,
        private val length : Int,
        private val published : Time,
        private val artist : String,
        private val matatu: String

)




