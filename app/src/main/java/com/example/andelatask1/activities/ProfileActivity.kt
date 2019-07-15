package com.example.andelatask1.activities

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AppCompatDelegate
import android.view.MenuItem
import com.example.andelatask1.R
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onOptionsItemSelected(item: MenuItem?):Boolean{
        if(item!!.itemId == android.R.id.home){
            finish();
        }
        return true;
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile);
        setSupportActionBar(toolbar3);
        supportActionBar!!.setDisplayHomeAsUpEnabled(true);
        supportActionBar!!.setTitle("About ALC");

    }

    companion object{
        fun activityIntent(context:Context):Intent {
            return Intent(context,ProfileActivity::class.java);
        }
    }
}
