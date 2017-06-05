package com.example.palmdigital.chooseatventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NinjaActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninja);

        // referances

        // TextViews
        TextView textView_story    = (TextView) findViewById(R.id.textView_story);

        textView_story.setText("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
    } // end of onCreate() Method
}
