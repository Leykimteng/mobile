package com.example.msi.solo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sh = studenthelper(this)
        insertdata.setOnClickListener {
            var name = name.text.toString()
            var roll = rollnumber.text.toString().toInt()

            var s = student(name,roll)
            sh.insertData(s)
        }

        readdata.setOnClickListener {
            var slist = sh.readData()
            resulttext.text = ""
            for ( i in 0..slist.size -1 )
            {
                resulttext.append("ID : "+slist.get(i).id.toString()+ "\nName : "+ slist.get(i).name.toString()+"\nRoll : "+ slist.get(i).roll.toString())
            }
        }
    }
}