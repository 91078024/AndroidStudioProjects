package org.palmdigital.madlibpuppylove_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeStory (View view)
    {
        // get all the referance
        TextView tv_story = (TextView) findViewById(R.id.text_view_story);
        EditText et_color01 = (EditText) findViewById(R.id.edit_text_color01);
        EditText et_bodyPart01 = (EditText) findViewById(R.id.edit_text_bodypart01);
        EditText et_noun01 = (EditText) findViewById(R.id.edit_text_noun01);
        EditText et_verb01 = (EditText) findViewById(R.id.edit_text_verb01);
        EditText et_adjective01 = (EditText) findViewById(R.id.edit_text_adjective01);
        EditText et_adjective02 = (EditText) findViewById(R.id.edit_text_adjective02);
        EditText et_verb02 = (EditText) findViewById(R.id.edit_text_verb02);
        EditText et_noun02 = (EditText) findViewById(R.id.edit_text_noun02);
        EditText et_noun03 = (EditText) findViewById(R.id.edit_text_noun03);


        String str_color01 = et_color01.getText().toString();
        String str_bodypart01 = et_bodyPart01.getText().toString();
        String str_noun01 = et_noun01.getText().toString();
        String str_verb01 = et_verb01.getText().toString();
        String str_adjective01 = et_adjective01.getText().toString();
        String str_adjective02 = et_adjective02.getText().toString();
        String str_verb02 = et_verb02.getText().toString();
        String str_noun02 = et_noun02.getText().toString();
        String str_noun03 = et_noun03.getText().toString();

        String story = "Today I saw him again. When he looks at me with those " + str_color01 + " eyes, it makes my " + str_bodypart01 + " go pitterpat," +
            " and I feel as if I have " + str_noun01 + " in my stomach. When he scrunches his nose, "
                + "I want to " + str_verb01 + " him softly. He is so " + str_adjective01 + " and " + str_adjective02 + ". "
                + "Tomorrow he will be mine. For now he " + str_verb02 + " in the store " + str_noun02 + " looking at me. " + str_noun03 + " love is hard to resist!";
        // story = story + str_color + str_bodypart + str_noun;
        

        tv_story.setText(story);
    }
}
