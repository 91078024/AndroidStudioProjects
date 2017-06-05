package org.palmdigital.intent_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{
    // fields
    String newString;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

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

    public void next02(View view)
    {
        // references
        // references
        EditText et_noun01 = (EditText) findViewById(R.id.edit_text_noun01);
        String str_noun01 = et_noun01.getText().toString();

        EditText et_adj02 = (EditText) findViewById(R.id.edit_text_adj02);
        String str_adj02 = et_adj02.getText().toString();

        EditText et_noun02 = (EditText) findViewById(R.id.edit_text_noun02);
        String str_noun02 = et_noun02.getText().toString();


        String story = newString + ". To make a pizza, you need to take a lump of "
                + str_noun01 + " and make a thin, round " + str_adj02 + " " + str_noun02 + ".";

        Intent i = new Intent(this, Main3Activity.class);
        i.putExtra("STORY_SO_FAR", story);

        startActivity(i);
    }
}
