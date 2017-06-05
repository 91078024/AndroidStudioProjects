package org.palmdigital.intent_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity
{
    // fields
    String newString;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

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

    public void next03(View view)
    {
        // references
        // references
        EditText et_adj03 = (EditText) findViewById(R.id.edit_text_adj03);
        String str_adj03 = et_adj03.getText().toString();

        EditText et_adj04 = (EditText) findViewById(R.id.edit_text_adj04);
        String str_adj04 = et_adj04.getText().toString();

        EditText et_plnoun01 = (EditText) findViewById(R.id.edit_text_pl_noun01);
        String str_plnoun01 = et_plnoun01.getText().toString();


        String story = newString + " Then you cover it with " + str_adj03 + " sauce " + str_adj04
                + " cheese, and fresh chopped " + str_plnoun01;

        Intent i = new Intent(this, Main4Activity.class);
        i.putExtra("STORY_SO_FAR", story);

        startActivity(i);
    }
}
