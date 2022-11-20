package com.example.criminalintent

import android.icu.text.CaseMap.Title
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Crime(@PrimaryKey val id: UUID = UUID.randomUUID(),
                 var title:String = "", var date: Date = Date(),  var isSolved: Boolean = false,
                 var requiresPolice:Boolean = false, var suspect:String = " ") {
    /*var title:String = ""
    var date: Date? = null
    var isSolved: Boolean? = null
    var requiresPolice: Int?=0
    constructor(id: UUID, title: String, date: Date, isSolved:Boolean, requiresPolice:Int):this() {
        this.title = title
        this.date = date
        this.id = id
        this.isSolved=isSolved
        this.requiresPolice=requiresPolice
    }
     */
}
