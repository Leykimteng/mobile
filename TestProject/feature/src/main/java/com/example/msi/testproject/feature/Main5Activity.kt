package com.example.msi.testproject.feature

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main5.*

class Main5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        button4.setOnClickListener {
            var i = Intent(this,Main9Activity::class.java)
            startActivity(i)
        }
        button4.setOnClickListener {
            var i = Intent(this,Main6Activity::class.java)
            startActivity(i)
        }
        button5.setOnClickListener {
            var i = Intent(this,Main7Activity::class.java)
            startActivity(i)
        }
        button3.setOnClickListener {
            var i = Intent(this,Main8Activity::class.java)
            startActivity(i)
        }
    }
}
