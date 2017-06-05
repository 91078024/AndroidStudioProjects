package org.palmdigital.intent_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next01(View view)
    {
       // references
        EditText et_adj01 = (EditText) findViewById(R.id.edit_text_adj01);
        String str_adj01 = et_adj01.getText().toString();

        EditText et_nat01 = (EditText) findViewById(R.id.edit_text_nat01);
        String str_nat01 = et_nat01.getText().toString();

        EditText et_person01 = (EditText) findViewById(R.id.edit_text_person01);
        String str_person01 = et_person01.getText().toString();

        String story = "Pizza was invented by a " + str_adj01 + " " + str_nat01 + " chef named " + str_person01;

        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("STORY_SO_FAR", story);

        startActivity(i);
    }
}
