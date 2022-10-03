package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClear(view: View){
        findViewById<TextView>(R.id.textView).text = "0"
    }

    fun btnNumberClick(view: View){
        val textView = findViewById<TextView>(R.id.textView)
        val text = textView.text;
        val value = findViewById<Button>(view.id).text

        if(text != "0" && text != "Syntax Error")
            textView.text = "$text$value"
        else
            textView.text = value
    }

    fun btnOperatorClick(view: View){

    }

    fun btnEqualClick(view: View){

        val textView = findViewById<TextView>(R.id.textView)
        try {
            val result = EvaluateString.evaluate(textView.text.toString())
            textView.text = "$result"
        }
        catch (exc: Exception) {
            textView.text = "Syntax Error"
        }

    }
}