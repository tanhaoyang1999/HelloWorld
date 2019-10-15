package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonPressMe : Button = findViewById(R.id.buttonPressMe)
        buttonPressMe.setOnClickListener{showMessage()}
    }

    private fun showMessage(){
        val textViewMessage : TextView = findViewById(R.id.textViewPressMe)
        textViewMessage.setText(getString(R.string.greeting))
    }
}
