package com.example.msi.solo

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class student
{
    var id:Int = 0
    var name:String = ""
    var roll:Int = 0

    constructor(name: String, roll: Int) {
        this.name = name
        this.roll = roll
    }

    constructor()
}

val DB_name = "B4"
val tb_name = "Student"
val id = "id"
val name = "name"
val roll = "roll"

class studenthelp(context:Context): SQLiteOpenHelper(context, DB_name,null,1)
{
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(db: SQLiteDatabase?) {
        var crtb = "create table "+ tb_name + " ( "+id+" integer primary key autoincrease , "+ name+" varchar(10) , "+ roll+ " integer);"
        db?.execSQL(crtb)
    }

    fun insertdata(s:student){
        var db = this.writableDatabase
        var cv = ContentValues()

        cv.put(name,s.name)
        cv.put(roll,s.roll)

        db.insert(tb_name,null,cv)
    }

    fun readdata():ArrayList<student>{
        var db = readableDatabase
        var cr = db.rawQuery("select 8 from "+ tb_name,null)

        var arrlist = ArrayList<student>()
        cr.moveToFirst()
        do {
            cr.getString(0)
            cr.getString(1)
            cr.getString(2)
        }while (cr.moveToNext())
        return arrlist

    }

}