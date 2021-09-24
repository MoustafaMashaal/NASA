package com.example.faireforest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class DroughtActivity2 extends AppCompatActivity {
    WebView webView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drought2);
        webView = findViewById(R.id.webview1);


        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        webView.loadUrl("https://www.arcgis.com/apps/webappviewer/index.html?id=c08d5270c6ad4833a4723256e00f4b48&extent=-18482590.6858%2C1997475.9086%2C-2339090.312%2C9902899.122%2C102100");

    }
}