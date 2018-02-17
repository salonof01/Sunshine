package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView mdisplayResult;
    private String forcast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
         mdisplayResult = (TextView)findViewById(R.id.display_weather);
        // TODO (2) Display the weather forecast that was passed from MainActivity


        Intent intentThatStartedThisActivity = getIntent();

        if (intentThatStartedThisActivity != null){
            if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)){
                   forcast = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT);
                   mdisplayResult.setText(forcast);
            }
        }
    }
}