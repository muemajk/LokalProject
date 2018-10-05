package com.m.papijames.matziki

import java.sql.Time

/**
 * Created by papi james on 07/02/2018.
 */
data class Messages (private val message:String,
                     private val timestamp:Time,
                     private val sender:String,
                     private val senderimg : String,
                     private val picture:String,
                     private val audiolink:String)