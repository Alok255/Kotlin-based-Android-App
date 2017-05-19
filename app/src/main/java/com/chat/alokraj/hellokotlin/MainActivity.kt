package com.chat.alokraj.hellokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn=findViewById(R.id.btn) as Button
        btn.setOnClickListener {
            Toast.makeText(this,"Hello Kotlin",Toast.LENGTH_LONG).show()
        }
    }
}
