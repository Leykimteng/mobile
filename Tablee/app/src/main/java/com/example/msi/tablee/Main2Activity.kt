package com.example.msi.tablee

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        next.setOnClickListener {
            var i = Intent(this,Main5Activity::class.java)
            startActivity(i)
        }
        b4.setOnClickListener {
            var i = Intent(this,Main4Activity::class.java)
            startActivity(i)
        }
        b6.setOnClickListener {
            var i = Intent(this,Main6Activity::class.java)
            startActivity(i)
        }
    }
}
