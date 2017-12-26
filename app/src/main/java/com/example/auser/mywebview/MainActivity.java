package com.example.auser.mywebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        webView=new WebView(this);//不透過layout
        setContentView(webView);
        webView.loadUrl("http://192.168.58.23/");



//        wv=(WebView)findViewById(R.id.webView);
//        String url=getIntent().getStringExtra("http://localhost:60342/Default.aspx");
//        wv.getSettings().setJavaScriptEnabled(true);//現在網站都很多使用JavaScript,所以打開webview功能
//        wv.setWebViewClient(new WebViewClient());
//        wv.loadUrl(url);
    }
}
