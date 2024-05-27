package com.example.pa_syamsi2

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_layout)

        Handler(Looper.getMainLooper()).postDelayed({
            goToSignIn()
        }, 3000L)
    }

    private fun goToSignIn() {
        Intent(this, SignInActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }

}