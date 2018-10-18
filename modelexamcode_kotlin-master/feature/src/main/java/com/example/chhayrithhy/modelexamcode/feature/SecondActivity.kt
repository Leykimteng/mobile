package com.example.chhayrithhy.modelexamcode.feature

import android.content.Intent
import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.res.ResourcesCompat
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val title = this.findViewById(R.id.activity2) as TextView
        val font: Typeface? = ResourcesCompat.getFont(this, R.font.one_time)
        title.typeface = font

        var receivedText: String = intent.getStringExtra("TEXT")
        val showText = findViewById<TextView>(R.id.passedText)
        showText.text = receivedText
    }
}
