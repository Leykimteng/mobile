package com.example.msi.testproject.feature

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        explicit.setOnClickListener{
            var msg = msg.text.toString()
            var ins = Intent(this,Main2Activity::class.java)
            ins.putExtra("msg",msg)
            startActivity(ins)
            Toast.makeText(this,"Go to Activity2",Toast.LENGTH_LONG).show()
        }
        button2.setOnClickListener{
            var ii = Intent(this,Main4Activity::class.java)
            startActivity(ii)
            Toast.makeText(this,"Activity 4",Toast.LENGTH_LONG).show()
        }
    }
}
