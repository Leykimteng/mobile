package com.example.msi.tablee

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView

data class stud(var name:String, var Email:String, var mobile:String)

object Studentcount
{
    var arrList = listOf<stud>(
            stud("Robert Downey, Jr.","RobertDowney@gmail.com","0152345678"),
            stud("Elizabeth Olsen","ElizabethOlsen@gmail.com","0142345678"),
            stud("Chris Evans","Chrisevans@gmail.com","0132345678"),
            stud("Samuel L. Jackson","Samueljackson@gmail.com","012345678"),
            stud("Chris Hemsworth","Chrishemsworth5@gmail.com","0112345678")
    )


}


class mycustonadapter(context:Context):BaseAdapter(){
    var mycontext:Context
    init {
        mycontext=context
    }
    override fun getCount():Int {
        return Studentcount.arrList.count()
    }
    override fun getView(position:Int,contentView:View?,parent:ViewGroup):View{
        var inflater = LayoutInflater.from(mycontext)
        var view = inflater.inflate(R.layout.activity_main2,parent,false)
        var view1=inflater.inflate(R.layout.activity_main,parent,false)
        var name = view.findViewById<TextView>(R.id.name)
        name.text = Studentcount.arrList.get(position).name
        return view
    }
    override fun getItem(position:Int):Any{
        return ""
    }
    override fun getItemID(position:Int):Long{
        return position.toLong()
    }
}