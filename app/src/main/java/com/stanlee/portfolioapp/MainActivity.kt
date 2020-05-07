package com.stanlee.portfolioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_social.setOnClickListener {
            val dialog = BottomSheetDialog(this)
            val view = layoutInflater.inflate(R.layout.social_layout, null)
            dialog.setContentView(view)
            dialog.show()
        }
    }

    fun openEmail(view: View) {}
    fun openGithub(view: View) {}
    fun openTwitter(view: View) {}
    fun openWhatsapp(view: View) {}
    fun openFacebook(view: View) {}
    fun openInstagram(view: View) {}
    fun openLinkedIn(view: View) {}
    fun openSkype(view: View) {}
    fun openPlaystore(view: View) {}
    fun openAndroid(view: View) {}
    fun openChrome(view: View) {}
    fun openYoutube(view: View) {}
}
