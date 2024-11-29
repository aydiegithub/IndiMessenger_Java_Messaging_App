package com.apsapps.indimessenger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class privacyActivity extends AppCompatActivity {
    WebView webView;
    public String fileName = "privacy.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy);
        webView = (WebView) findViewById(R.id.privacy);
        // displaying content in WebView from html file that stored in assets folder
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/"+ fileName);


    }
}