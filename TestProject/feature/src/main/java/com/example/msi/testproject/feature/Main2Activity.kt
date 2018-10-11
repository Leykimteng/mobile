package com.example.msi.testproject.feature

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var username = intent.getStringExtra("username")
        var password = intent.getStringExtra("password")

        var msg =intent.getStringExtra("msg")
        if(msg==null)
        success1.text = "Welcome "+username+" : your password is "+password
        else success1.text = msg

        button1.setOnClickListener{
            var i = Intent(this,Main3Activity::class.java)
            startActivity(i)
            Toast.makeText(this,"Go to Activity3",Toast.LENGTH_LONG).show()
        }
    }
}
