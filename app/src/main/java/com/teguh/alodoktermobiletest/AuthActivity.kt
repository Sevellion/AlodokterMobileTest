package com.teguh.alodoktermobiletest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.ButtonLogin).setOnClickListener{ view ->
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}