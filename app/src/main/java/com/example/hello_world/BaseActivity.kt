package com.example.hello_world

import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity :  AppCompatActivity() {
    fun showBtnBack(){
        val imageViewBack = findViewById<ImageView>(R.id.imageViewBack)
        imageViewBack.visibility=View.VISIBLE
        imageViewBack.setOnClickListener(View.OnClickListener {
            finish()
        })
    }

}