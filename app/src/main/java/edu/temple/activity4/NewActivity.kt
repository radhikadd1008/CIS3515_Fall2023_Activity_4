package edu.temple.activity4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        val value = intent.getFloatExtra(MESSAGE_KEY, 22F)

        with (findViewById<TextView>(R.id.textView)) {
            textSize = value
        }
    }
}