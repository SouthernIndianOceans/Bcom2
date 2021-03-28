package com.bcom.da

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SettingsLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings_layout)
    }
    fun backtoMain(View: View) {
        val intent = Intent(this, MainActivity::class.java)
        this.startActivity(intent)
    }
}