package com.example.chhayrithhy.modelexamcode.feature

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.res.ResourcesCompat
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class CardViewExample : AppCompatActivity() {
    private val acti = findViewById<TextView>(R.id.activity4)
    private val nextBtn = findViewById<Button>(R.id.nextBtn)
    private val prevBtn = findViewById<Button>(R.id.prevBtn)
    private val title = findViewById<TextView>(R.id.title)
    private val imageThumbnail = findViewById<ImageView>(R.id.image)
    private val fishList = fishData()
    private var listPosition = 0;


//    init{
//        setFontStyle()
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_view_example)

        imageThumbnail.setImageResource(R.drawable.fish_4)


//        nextBtn.setOnClickListener{
//            listPosition++
//            if(listPosition < 3 && listPosition > 0){
//                val image = fishList.get("Fish " + (listPosition + 1).toString())
//                nextBtn(image)
//            }
//        }
//
//        prevBtn.setOnClickListener{
//            listPosition--
//            if(listPosition < 3 && listPosition >= 0){
//                val image = fishList.get("Fish " + (listPosition + 1).toString())
//                prevBtn(image)
//            }
//
//        }

    }

    private fun fishData():LinkedHashMap<String, Int>{
        val fish = LinkedHashMap<String, Int>()
        fish.put("Fish 1", R.drawable.fish_1)
        fish.put("Fish 2", R.drawable.fish_2)
        fish.put("Fish 3", R.drawable.fish_3)
        fish.put("Fish 4", R.drawable.fish_4)
        return fish
    }
//
//    private fun setFontStyle(){
//        val font: Typeface? = ResourcesCompat.getFont(this, R.font.one_time)
//        nextBtn.typeface = font
//        title.typeface = font
//        acti.typeface = font
//    }
//
//    fun prevBtn (image: Int?) {
//        imageThumbnail.setImageResource(image!!)
//    }
//
//    fun nextBtn (image: Int?) {
//        imageThumbnail.setImageResource(image!!)
//    }
}
