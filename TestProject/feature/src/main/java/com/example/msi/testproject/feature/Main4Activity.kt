package com.example.msi.testproject.feature

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main4.*
import kotlinx.android.synthetic.main.activity_main4.view.*

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        login.setOnClickListener{
            var i = Intent(this,Main5Activity::class.java)
            startActivity(i)
            Toast.makeText(this,"Activity 5",Toast.LENGTH_LONG).show()
        }



    }
}