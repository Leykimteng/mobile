package com.example.msi.testing

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button4.setOnClickListener {
            var i = Intent(this,Main2Activity::class.java)
            startActivity(i)
        }
        button5.setOnClickListener {
            var i = Intent(this,Main3Activity::class.java)
            startActivity(i)
        }
        button3.setOnClickListener {
            var i = Intent(this,Main4Activity::class.java)
            startActivity(i)
        }
    }
}
