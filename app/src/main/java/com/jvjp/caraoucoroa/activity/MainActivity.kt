package com.jvjp.caraoucoroa.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jvjp.caraoucoroa.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        button_gamer.setOnClickListener {
            changeScreen()
        }

    }

    private fun changeScreen() {
        val mIntent = Intent(this, ResultActivity::class.java)
        val numberRandom = Random.nextInt(2)
        mIntent.putExtra("number", numberRandom)
        startActivity(mIntent)

    }

}