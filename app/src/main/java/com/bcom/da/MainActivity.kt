package com.bcom.da

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val subjects = resources.getStringArray(R.array.Subjects)
        val spinner = findViewById<Spinner>(R.id.spinner)
        if (spinner != null) {
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, subjects)
            spinner.adapter = adapter
        }
    }

    fun showSettings(view: View) {
        val intent = Intent(this@MainActivity, SettingsLayout::class.java)
        this@MainActivity.startActivity(intent)
    }
    fun table(view: View) {
        
    }
}
