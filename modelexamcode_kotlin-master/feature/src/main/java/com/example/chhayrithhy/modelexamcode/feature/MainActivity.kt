package com.example.chhayrithhy.modelexamcode.feature

import android.content.Intent
import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.res.ResourcesCompat
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tView = findViewById(R.id.activity1) as TextView
        val myCustomFont: Typeface? = ResourcesCompat.getFont(this, R.font.one_time)
        tView.typeface = myCustomFont
    }

    fun passHelloBtn(view: View) {
        val text = "Hello"
        var i = Intent(this, SecondActivity::class.java)
        i.putExtra("TEXT", text.toString())
        startActivity(i)
    }

    fun tableLayoutBtn(view: View){
        val i = Intent(this, TableLayout::class.java)
        startActivity(i)
    }

    fun cardViewBtn(view: View){
        val i = Intent(this, CardViewExample::class.java)
        startActivity(i)

//        Toast.makeText(this, "eh", Toast.LENGTH_SHORT).show()
    }

    fun bgService(view: View){
        val i = Intent(this, BGService::class.java)
        startActivity(i)
    }


}
