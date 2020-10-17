package com.lethalmaus.lazy_shortcuts

import android.content.Intent
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onStart() {
        super.onStart()
        startActivity(Intent(Settings.ACTION_WIFI_SETTINGS))
        finish()
    }
}