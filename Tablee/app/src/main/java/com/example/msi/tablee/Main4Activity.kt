package com.example.msi.tablee
import android.content.Context
import android.graphics.Color
import android.opengl.Visibility
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        var listview = findViewById<ListView>(R.id.listview)

//        var arrlist = ArrayList<String>()
//
//        arrlist.add("Testing")
//        arrlist.add("Testing")
//        arrlist.add("Testing")
//        arrlist.add("Testing")
//        arrlist.add("Testing")
//        arrlist.add("Testingffgfffgfggfgfgfgfgfgfgfgdhfghdgfhdgfgg")
//        arrlist.add("Testing")
//        arrlist.add("Testing")
//        arrlist.add("Testing")
//        arrlist.add("Testing                   777")

        //var adapter = ArrayAdapter(this,android.R.layout.simple_list_item_single_choice,arrlist)
        var adapter = MycustomAdapter(this)
        listview.adapter = adapter

    }
}

class MycustomAdapter(context:Context): BaseAdapter()
{
    var names = arrayListOf<String>(
        "testing","Hwllo world","My Cat"
    )
    var myContext:Context
    init {
        myContext = context
    }

    override fun getCount(): Int {
        return Studentcount.arrList.count()
    }

//    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//        var tv = TextView(myContext)
//        tv.text = names.get(position)
//        return tv
//    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var inflater = LayoutInflater.from(myContext)
        var view = inflater.inflate(R.layout.activity_main6,parent,false)
        var name = view.findViewById<TextView>(R.id.name)
        //name.text = names.get(position)
        name.text = Studentcount.arrList.get(position).name
        var email = view.findViewById<TextView>(R.id.email)
        //email.text = "testing@gmail.com"
        email.text = Studentcount.arrList.get(position).Email
        var mobile = view.findViewById<TextView>(R.id.mobile)
        //mobile.text = "098765432"
        mobile.text = Studentcount.arrList.get(position).mobile
        var img = view.findViewById<ImageView>(R.id.imageView)
        img.setImageResource(R.mipmap.ic_launcher)
        return view
    }

    override fun getItem(position: Int): Any {
        return ""
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

}