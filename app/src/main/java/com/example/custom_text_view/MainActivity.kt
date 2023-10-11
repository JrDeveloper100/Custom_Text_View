package com.example.custom_text_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customtextview.CustomTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<CustomTextView>(R.id.textView)
        val textView2 = findViewById<CustomTextView>(R.id.textView2)
        val textView3 = findViewById<CustomTextView>(R.id.textView3)
        textView.RUFINA()
        textView2.ACLONICA()
        textView3.LATO_BOLD()

    }
}