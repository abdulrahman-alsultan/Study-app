package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KotlinScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_screen)

        val myRv = findViewById<RecyclerView>(R.id.rvKotlin)
        myRv.adapter = KotlinScreenRecycler()
        myRv.layoutManager = LinearLayoutManager(this)
    }
}