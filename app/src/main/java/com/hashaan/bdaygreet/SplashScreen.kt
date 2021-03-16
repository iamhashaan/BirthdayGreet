package com.hashaan.bdaygreet

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    private val Splash_time = 1800

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
         Handler().postDelayed( {
             val intent = Intent(this, MainActivity::class.java)
             startActivity(intent)
         }, Splash_time.toLong())
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}