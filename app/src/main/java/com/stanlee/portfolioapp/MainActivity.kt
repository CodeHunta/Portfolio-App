package com.stanlee.portfolioapp

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val tag = "MainActivity"

    companion object{
        const val USER_SHARED_PREF = "com.stanlee.portfolioapp.PREFERENCES"
        const val EMAIL = "EMAIL"
        const val PASSWORD = "PASSWORD"
    }

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

    private fun saveToSharedPref(){
        val sharedPref = getSharedPreferences(USER_SHARED_PREF, Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putString(EMAIL, findViewById<EditText>(R.id.edit_email).text.toString())
        editor.putString(PASSWORD, findViewById<EditText>(R.id.btn_signup).text.toString())
        editor.apply()
    }

    fun openLogIn(view: View) {
        saveToSharedPref()
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    fun openEmail(view: View) {
        val emailIntent =
            Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "stanleyumez@outlook.com", null))
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Hello Stanley")
        startActivity(emailIntent)
    }

    fun openGithub(view: View) {
        val githubIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/CodeHunta"))
        startActivity(githubIntent)
    }

    fun openTwitter(view: View) {
        val twitterIntent =
            Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/CodeHunta?s=09"))
        startActivity(twitterIntent)
    }

    fun openWhatsapp(view: View) {
        val whatsappIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://api.whatsapp.com/send?phone=+2348032324739")
        )
        startActivity(whatsappIntent)
    }

    fun openFacebook(view: View) {
        val fbIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://fb.com/manstylo"))
        startActivity(fbIntent)
    }

    fun openInstagram(view: View) {
        val igIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/manstylo.ng"))
        startActivity(igIntent)
    }

    fun openLinkedIn(view: View) {
        val linkedinIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.linkedin.com/in/stanley-umezuruike-1417a884")
        )
        startActivity(linkedinIntent)
    }

    fun openSkype(view: View) {
        val skypeIntent =
            Intent(Intent.ACTION_VIEW, Uri.parse("https://web.skype.com/stanleyumez?call"))
        startActivity(skypeIntent)
    }

    fun openPlaystore(view: View) {
        val playIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com"))
        startActivity(playIntent)
    }

    fun openAndroid(view: View) {
        val androidIntent =
            Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/kotlin/"))
        startActivity(androidIntent)
    }

    fun openChrome(view: View) {
        val chromeIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://bit.ly/OutWord"))
        startActivity(chromeIntent)
    }

    fun openYoutube(view: View) {
        val ytIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.youtube.com/channel/UCr37EHkT42aJNX9hAzYArdw")
        )
        startActivity(ytIntent)
    }

    override fun onStart() {
        super.onStart()
        Log.v(tag, "App status : onStart state")
    }

    override fun onResume() {
        super.onResume()
        Log.v(tag, "App status : onResume state")
    }

    override fun onPause() {
        super.onPause()
        Log.v(tag, "App status : onPause state")
    }

    override fun onStop() {
        super.onStop()
        Log.v(tag, "App status : onStop state")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(tag, "App status : onDestroy state")
    }
}
