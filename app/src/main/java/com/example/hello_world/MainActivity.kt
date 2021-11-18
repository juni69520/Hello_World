package com.example.hello_world

import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewTitle:TextView = findViewById<TextView>(R.id.textViewHomeTitle)
        val buttonHome = findViewById<Button>(R.id.buttonHome)
        buttonHome.setOnClickListener(View.OnClickListener {
            textViewTitle.setText("Hi Quentin")
            val newIntent= Intent(application,DetailActivity2::class.java)
            startActivity(newIntent)
        })
    }
}