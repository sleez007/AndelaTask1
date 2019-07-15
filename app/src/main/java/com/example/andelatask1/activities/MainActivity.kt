package com.example.andelatask1.activities

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.andelatask1.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        setSupportActionBar(toolbarM);
        supportActionBar!!.setTitle("About ALC");

        about_button.setOnClickListener {
            val aboutIntent = AboutActivity.activityIntent(this);
            startActivity(aboutIntent);
        }

        profile_button.setOnClickListener {
            val profileIntent = ProfileActivity.activityIntent(this);
            startActivity(profileIntent);
        }
    }

}
