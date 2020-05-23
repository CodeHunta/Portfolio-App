package com.stanlee.portfolioapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.stanlee.portfolioapp.databinding.ActivitySignupBinding
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {

    companion object {
        const val USER_SHARED_PREF = "com.stanlee.portfolioapp.PREFERENCES"
        const val fullName = "FULL NAME"
        const val email = "EMAIL"
        const val password = "PASSWORD"
    }

    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        val sign = binding.root
        setContentView(sign)

        btn_log_signup.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
//        btn_sign_signup.setOnClickListener {
//            startActivity(Intent(this, LoginActivity::class.java))
//        }
    }

    private fun saveToSharedPref() {
        val sharedPref = getSharedPreferences(USER_SHARED_PREF, Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putString(fullName, binding.editFullName.text.toString())
        editor.putString(email, binding.editEmail.text.toString())
        editor.putString(password, binding.editPwd.text.toString())
        editor.apply()
        startActivity(Intent(this, LoginActivity::class.java))
    }

    fun openLogIn(view: View) {
        saveToSharedPref()
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}