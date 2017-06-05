package com.example.palmdigital.chooseatventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BackyardActivity extends AppCompatActivity implements View.OnClickListener
{

    // fields

    //Buttons
    Button leftButton;
    Button rightButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backyard);

        // referances

        // TextViews
        TextView textView_story    = (TextView) findViewById(R.id.textView_story);
        TextView textView_question = (TextView) findViewById(R.id.textView_question);

        textView_story.setText("As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
        textView_question.setText("As the man starts to prepare you as soup, do you...Scream or Faint?");

        //Buttons
        leftButton = (Button) findViewById(R.id.button_Left);
        rightButton = (Button) findViewById(R.id.button_Right);

        leftButton.setText("Scream");
        rightButton.setText("Faint");

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
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        } // explore
        else if (view.getId() == R.id.button_Right)
        {
            // send user to explore activity
            Intent i = new Intent(this,SoupActivity.class);
            startActivity(i);
        }

    }
}
