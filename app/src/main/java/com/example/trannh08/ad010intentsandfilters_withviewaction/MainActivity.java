package com.example.trannh08.ad010intentsandfilters_withviewaction;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_startBrowserView, button_startBrowserLaunch, button_exceptionalCondition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_startBrowserView = (Button)findViewById(R.id.button_startBrowserView);
        button_startBrowserView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(intent);
            }
        });

        button_startBrowserLaunch = (Button)findViewById(R.id.button_startBrowserLaunch);
        button_startBrowserLaunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.trannh08.ad010intentsandfilters_withviewaction.LAUNCH", Uri.parse("http://www.google.com"));
                startActivity(intent);
            }
        });

        button_exceptionalCondition = (Button)findViewById(R.id.button_exceptionalCondition);
        button_exceptionalCondition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.trannh08.ad010intentsandfilters_withviewaction.LAUNCH", Uri.parse("https://www.google.com"));
                startActivity(intent);
            }
        });
    }
}
