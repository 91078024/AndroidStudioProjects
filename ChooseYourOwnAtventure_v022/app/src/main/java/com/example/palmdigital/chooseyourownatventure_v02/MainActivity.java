package com.example.palmdigital.chooseyourownatventure_v02;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    //fields
    TextView textView_Story;
    TextView textView_Question;
    Button leftButton;
    Button rightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leftButton = (Button) findViewById(R.id.button_Left);
        rightButton = (Button) findViewById(R.id.button_Right);

        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);

        leftButton.setText("Wake up");
        rightButton.setText("Explore");

        textView_Story = (TextView) findViewById(R.id.textView_story);
        textView_Question = (TextView) findViewById(R.id.textView_question);
        textView_Story.setText("One morning the Tortoise woke up in a dream.");
        textView_Question.setText("Do you want to wake up or explore the dream?");

    }
    public void onClick (View view)
    {
        if (view.getId() == R.id.button_Left)
        {
            textView_Story.setText("You wake up and have a boring day. The End.");
            textView_Question.setText("");
            leftButton.setText("");
            rightButton.setText("");
            leftButton.setBackgroundColor(0x00000000);
            rightButton.setBackgroundColor(0x00000000);
        }
    }
}
