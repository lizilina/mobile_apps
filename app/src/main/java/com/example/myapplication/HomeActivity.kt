package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class HomeActivity : AppCompatActivity() {

    lateinit var bookName: EditText
    lateinit var bookPrice: EditText
    lateinit var bookPageNumber: EditText
    lateinit var nextBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bookName = findViewById(R.id.bookNameEditText)
        bookPrice = findViewById(R.id.bookPriceEditText)
        bookPageNumber = findViewById(R.id.bookPageEditText)
        nextBtn = findViewById(R.id.nextBt)
        nextBtn.setOnClickListener {
            var name = bookName.text.toString()
            var price = bookPrice.text.toString().toDouble()
            var page = bookPageNumber.text.toString().toInt()
        }
    }
}
