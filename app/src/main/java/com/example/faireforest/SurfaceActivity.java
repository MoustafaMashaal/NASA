package com.example.faireforest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class SurfaceActivity extends AppCompatActivity {
    WebView webView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surface);

        webView = findViewById(R.id.webview3);


        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        webView.loadUrl("https://data.giss.nasa.gov/rocke3d/maps/");
    }
}