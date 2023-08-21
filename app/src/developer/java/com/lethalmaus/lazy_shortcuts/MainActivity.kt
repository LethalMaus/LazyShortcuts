package com.lethalmaus.lazy_shortcuts

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.lethalmaus.lazy_shorcuts.R
import java.lang.RuntimeException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            startActivity(Intent(Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS))
        } catch (ex: RuntimeException) {
            Toast.makeText(this, R.string.error, Toast.LENGTH_SHORT).show()
        }
        finish()
    }
}