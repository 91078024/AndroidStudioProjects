package com.example.palmdigital.chooseatventure_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SoupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soup);

        // referances

        // TextViews
        TextView textView_story    = (TextView) findViewById(R.id.textView_story);

        textView_story.setText("You made a delicious soup! Yum! The end.");
    }
}
