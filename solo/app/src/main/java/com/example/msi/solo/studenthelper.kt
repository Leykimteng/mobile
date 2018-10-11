package com.example.msi.solo

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

val DB_name = "B4"
val T_name = "MyTbl"
val col_id = "id"
val col_name = "name"
val col_roll = "rool"

class studenthelper(context:Context) : SQLiteOpenHelper(context, DB_name,null,1)
{
    override fun onCreate(db: SQLiteDatabase?) {
        var crtbl = "create table "+T_name+" ("+ col_id+" integer primary key autoincrement, "+ col_name+" varchar(256),"+ col_roll+" integer"
        db?.execSQL(crtbl)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun insertData(s:student)
    {
        var db = this.writableDatabase
        var cv = ContentValues()

        cv.put(col_name,s.name)
        cv.put(col_roll,s.roll)

        db.insert(T_name, null, cv)
    }

    fun readData(): ArrayList<student>
    {
        var db = this.readableDatabase
        var cr = db.rawQuery("select * from "+ T_name,null)
        var slist = ArrayList<student>()
        var s = student()

        cr.moveToFirst()

        do {
            s.id = cr.getString(0).toString().toInt()
            s.name = cr.getString(1).toString()
            s.roll = cr.getString(2).toString().toInt()

            slist.add(s)
        }while (cr.moveToNext())
        return slist
    }
}