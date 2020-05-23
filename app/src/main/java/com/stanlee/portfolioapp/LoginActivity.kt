package com.stanlee.portfolioapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.stanlee.portfolioapp.databinding.ActivityLoginBinding
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val log: View = binding.root
        setContentView(log)

        btn_sign_login.setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
        }
    }

    fun openBio(view: View) {
        val sharedpref= getSharedPreferences(SignupActivity.USER_SHARED_PREF, Context.MODE_PRIVATE)
        val userEmail = sharedpref.getString(SignupActivity.email, "Not Available")
        val userPwd = sharedpref.getString(SignupActivity.password, "Not Available")

        if(userEmail.equals(binding.editEmailLogin.text.toString()) && userPwd.equals(binding.editPwdLogin.text.toString())) {
            startActivity(Intent(this, MainActivity::class.java))
        } else {
            Snackbar.make(view, "Please Sign Up First!", Snackbar.LENGTH_LONG).show()
        }
    }
}