package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {

    lateinit var binding:ActivitySearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            bookNameTextView.text = intent.extras?.getString("NAME", "no name")
            bookPagesTextView.text = intent.extras?.getInt("NUMBER", 0).toString()
            bookPriceTextView.text = intent.extras?.getDouble("PRICE", 0.0).toString()
            bookInstoreTextView.text = intent.extras?.getBoolean("INSTORE", false).toString()

            val imageURL = intent.extras?.getString("URL", "https://marketplace.canva.com/EAFaQMYuZbo/1/0/1003w/canva-brown-rusty-mystery-novel-book-cover-hG1QhA7BiBU.jpg")
            Glide.with(this@SearchActivity).load(imageURL).into(bookImageView)
        }
    }
}