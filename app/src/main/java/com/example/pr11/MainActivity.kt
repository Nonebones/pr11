package com.example.pr11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btnClick(view: View) {
        val photo: ImageView =findViewById(R.id.imageView2);
        val image:Int=R.drawable.dog;
        val description:String="This is logo";
        photo.setImageResource(image);
        photo.setContentDescription(description);


    }

    fun OnClick(view: View) {
        val photo: ImageView =findViewById(R.id.imageButton);
        val image:Int=R.drawable.btn_check_buttonless_on;
        val image1:Int=R.drawable.btn_check_buttonless_off

        val imageButtin: Boolean=true
        if(imageButtin)
        {
            photo.setImageResource(image)
        }
        else{
            photo.setImageResource(image1);
        }
    }
}