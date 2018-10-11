package com.example.msi.testproject.feature

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login.setOnClickListener{
            var username = username.text.toString()
            var password = password.text.toString()

            if(username=="hongch"&&password=="1234")
            {
                var i = Intent(this,Main2Activity::class.java)
                i.putExtra("username",username)
                i.putExtra("password",password)
                startActivity(i)
                Toast.makeText(this,"Welcome "+username, Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this,"Invalid Login", Toast.LENGTH_LONG).show()
            }

        }
        Log.i("LM","onCreate")
        Toast.makeText(this,"On Create",Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i("LM","OnStart")
        Toast.makeText(this,"On Start",Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i("LM","onResume")
        Toast.makeText(this,"On Resume",Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i("LM","onPause")
        Toast.makeText(this,"On Pause",Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i("LM","onStop")
        Toast.makeText(this,"On Stop",Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LM","onDestroy")
        Toast.makeText(this,"On Destroy",Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("LM","onRestart")
        Toast.makeText(this,"On Restart",Toast.LENGTH_LONG).show()
    }
}




