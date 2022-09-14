package com.example.kotlin_android

import android.content.ContextParams
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //автогенерируемый файл R у меня не генерируется и не отображается
        setContentView(R.layout.activity_main)
        var c = R.id.false_button

        var f = c
    }
}