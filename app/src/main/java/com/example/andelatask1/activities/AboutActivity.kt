package com.example.andelatask1.activities

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.http.SslError
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.webkit.SslErrorHandler
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.andelatask1.R
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {

    override fun onOptionsItemSelected(item: MenuItem?):Boolean{
        if(item!!.itemId == android.R.id.home){
            finish();
        }
        return true;
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about);
        setSupportActionBar(toolbar);
        supportActionBar!!.setDisplayHomeAsUpEnabled(true);
        supportActionBar!!.setTitle("ALC 4 Phase 1");

        about_detail_webview?.webViewClient=object:WebViewClient(){
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                return true
            }

            override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
                handler!!.proceed();
            }

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon);

                page_progress_bar!!.visibility= View.VISIBLE

            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                page_progress_bar!!.visibility= View.GONE
            }
        }
       about_detail_webview.settings.javaScriptEnabled=true;
        about_detail_webview.loadUrl("https://andela.com/alc/");
    }

    companion object{
        fun activityIntent(context: Context): Intent {
            return Intent(context,AboutActivity::class.java);
        }
    }
}
