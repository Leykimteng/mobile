package com.example.msi.tablee

data class stud(var name:String, var Email:String, var mobile:String)

object Studentcount
{
    var arrList = listOf<stud>(
            stud("Robert Downey, Jr.","RobertDowney@gmail.com","0152345678"),
            stud("Elizabeth Olsen","ElizabethOlsen@gmail.com","0142345678"),
            stud("Chris Evans","Chrisevans@gmail.com","0132345678"),
            stud("Samuel L. Jackson","Samueljackson@gmail.com","012345678"),
            stud("Chris Hemsworth","Chrishemsworth5@gmail.com","0112345678")
    )
}