package com.stanlee.portfolioapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_sign_login.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }

    fun openBio(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}