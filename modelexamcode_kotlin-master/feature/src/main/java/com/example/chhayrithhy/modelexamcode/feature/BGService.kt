package com.example.chhayrithhy.modelexamcode.feature

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class BGService : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bgservice)

        Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show()
    }
    var i = Intent(this, MyService2::class.java)
    fun btnPlayClicked(view: View){
        startService(i)
    }

    fun btnPauseClicked(view: View){
        stopService(i)
    }

}
