package com.example.palmdigital.chooseatventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    // fields

    //Buttons
    Button leftButton;
    Button rightButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // referances

        // TextViews
        TextView textView_story    = (TextView) findViewById(R.id.textView_story);
        TextView textView_question = (TextView) findViewById(R.id.textView_question);

        textView_story.setText("One morning the Tortoise woke up in a dream.");
        textView_question.setText("Do you want to wake up or explore the dream?");

        //Buttons
        leftButton = (Button) findViewById(R.id.button_Left);
        rightButton = (Button) findViewById(R.id.button_Right);

        leftButton.setText("Wake Up");
        rightButton.setText("Explore");

        // set clicklisteners
        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);
    } // end of onCreate() Method

    public void onClick(View view)
    {
        // wake up
        if(view.getId() == R.id.button_Left)
        {
            // send us to the Wake up Activity
            Intent i = new Intent(this, WakeUpActivity.class);
            startActivity(i);
        } // explore
        else if (view.getId() == R.id.button_Right)
        {
            // send user to explore activity
            Intent i = new Intent(this,ExploreActivity.class);
            startActivity(i);
        }
    }
}
