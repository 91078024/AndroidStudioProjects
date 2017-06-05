package org.palmdigital.intent_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity
{
    // fields
    String newString;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        // references
        //TextView tv_story = (TextView) findViewById(R.id.text_view_story);

        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                newString = null;
            }
            else
            {
                newString = extras.getString("STORY_SO_FAR");
            }
        }
        else
        {
            newString = (String) savedInstanceState.getSerializable("STORY_SO_FAR");
        }



        //tv_story.setText(newString);
    }

    public void next05(View view)
    {
        // references
        EditText et_food01 = (EditText) findViewById(R.id.edit_text_food01);
        String str_food01 = et_food01.getText().toString();

        EditText et_food02 = (EditText) findViewById(R.id.edit_text_food02);
        String str_food02 = et_food02.getText().toString();

        EditText et_number02 = (EditText) findViewById(R.id.edit_text_number02);
        String str_number01 = et_number02.getText().toString();


        String story = newString + " Some kids like " + str_food01 + " pizza the best, but my favorite is the "
                + str_food02 + " pizza. If I could, I would eat pizza " + str_number01 + " times a day!";

        Intent i = new Intent(this, Main6Activity.class);
        i.putExtra("STORY_SO_FAR", story);

        startActivity(i);
    }
}
