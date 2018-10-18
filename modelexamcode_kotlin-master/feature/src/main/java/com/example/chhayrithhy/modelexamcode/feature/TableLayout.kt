package com.example.chhayrithhy.modelexamcode.feature

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.res.ResourcesCompat
import android.widget.TextView

class TableLayout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_layout)

        val font: Typeface? = ResourcesCompat.getFont(this, R.font.one_time)
        var title = findViewById<TextView>(R.id.activity3)


    }
}
