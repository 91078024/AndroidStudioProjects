package org.palmdigital.intent_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity
{
    // fields
    String newString;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

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

    public void next04(View view)
    {
        // references
        // references
        EditText et_noun03 = (EditText) findViewById(R.id.edit_text_noun03);
        String str_noun03 = et_noun03.getText().toString();

        EditText et_num01 = (EditText) findViewById(R.id.edit_text_num01);
        String str_num01 = et_num01.getText().toString();

        EditText et_shape01 = (EditText) findViewById(R.id.edit_text_shape01);
        String str_shape01 = et_shape01.getText().toString();


        String story = newString + ". Next you have to bake it in a very hot " + str_noun03 +
                ". When it is done, cut it into " + str_num01 + " " + str_shape01 + ".";

        Intent i = new Intent(this, Main5Activity.class);
        i.putExtra("STORY_SO_FAR", story);

        startActivity(i);
    }
}
