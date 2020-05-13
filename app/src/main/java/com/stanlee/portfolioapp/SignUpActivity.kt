package com.stanlee.portfolioapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_signup.*

class SignUpActivity : AppCompatActivity() {

    companion object {
        const val USER_SHARED_PREF = "com.stanlee.portfolioapp.PREFERENCES"
        const val USERNAME = "FULL NAME"
        const val EMAIL = "EMAIL"
        const val PASSWORD = "PASSWORD"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        btn_log_signup.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        btn_sign_signup.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    private fun saveToSharedPref() {
        val sharedPref = getSharedPreferences(SignUpActivity.USER_SHARED_PREF, Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putString(
            SignUpActivity.EMAIL,
            findViewById<EditText>(R.id.edit_email).text.toString()
        )
        editor.putString(
            SignUpActivity.PASSWORD,
            findViewById<EditText>(R.id.btn_sign_login).text.toString()
        )
        editor.apply()
    }

    fun openLogIn(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}