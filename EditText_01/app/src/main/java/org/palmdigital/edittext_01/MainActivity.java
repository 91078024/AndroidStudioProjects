package org.palmdigital.edittext_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);


    }

    public void onClick(View view)
    {
        TextView result = (TextView) findViewById(R.id.textViewResult);
        EditText first = (EditText) findViewById(R.id.editTextFirst);
        EditText last = (EditText) findViewById(R.id.editTextLast);

        String fName = "Your Full Name Is: ";
        fName += first.getText().toString();
        String lName = last.getText().toString();
        fName += lName;

        result.setText(fName);
    }
}
