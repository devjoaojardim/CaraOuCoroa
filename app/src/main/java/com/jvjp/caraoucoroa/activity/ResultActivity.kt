package com.jvjp.caraoucoroa.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jvjp.caraoucoroa.R
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        val mDados = intent.extras!!["number"]



        if (mDados == 0) {
            image_coin.setImageResource(R.drawable.moeda_cara)
        } else {
            image_coin.setImageResource(R.drawable.moeda_coroa)
        }
        button_return.setOnClickListener {
            finish()
        }
    }
}


