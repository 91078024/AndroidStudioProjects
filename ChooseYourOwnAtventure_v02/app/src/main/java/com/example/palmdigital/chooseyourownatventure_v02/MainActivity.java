package com.example.palmdigital.chooseyourownatventure_v02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    // fields
    Button leftButton;
    Button rightButton;

    TextView textView_story = (TextView) findViewById(R.id.textView_story);
    TextView textView_question = (TextView) findViewById(R.id.textView_question);

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // references

        // TextViews
        textView_story.setText("One morning the Tortoise woke up in a dream.");
        textView_question.setText("Do you want to wake up or explore the dream?");

        // Buttons
        leftButton = (Button) findViewById(R.id.button_Left);
        rightButton = (Button) findViewById(R.id.button_Right);
        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);

        leftButton.setText("Wake Up");
        rightButton.setText("Explore");
    }

    public void onClick(View view)
    {
        if (view.getId() == R.id.button_Left)
        {
            textView_story.setText("You wake up and have a boring day. The end.");
        }
    }
}
