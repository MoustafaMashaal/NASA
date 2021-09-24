package com.example.faireforest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WiredFaireActivity extends AppCompatActivity {
    WebView webView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wired_faire);
        webView = findViewById(R.id.webview);


        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        webView.loadUrl("https://worldview.earthdata.nasa.gov/?v=-122.95283408700281,38.671043723157084,-118.9638907481288,40.49614590968436&e=true&efs=false&efd=2021-07-01,2021-07-29&efc=wildfires&l=MODIS_Terra_Thermal_Anomalies_Night,MODIS_Terra_Thermal_Anomalies_Day,Reference_Labels_15m,Reference_Features_15m,MODIS_Terra_CorrectedReflectance_TrueColor&lg=true&t=2021-07-14-T00%3A00%3A00Z");

    }
}