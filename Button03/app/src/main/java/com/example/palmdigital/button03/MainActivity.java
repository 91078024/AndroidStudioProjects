package com.example.palmdigital.button03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject01 = (Button) findViewById(R.id.buttonMyButton01);
        buttonObject01.setBackgroundColor(0xff00ffff);
        buttonObject01.setText("The Blue Pill");

        // let's make our button a click listener so it listens for clicks!!
        buttonObject01.setOnClickListener(this);

        Button buttonObject02 = (Button) findViewById(R.id.buttonMyButton02);
        buttonObject02.setBackgroundColor(0xffff0000);
        buttonObject02.setText("The Red Pill");

        buttonObject02.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.buttonMyButton01)
        {
            Log.i("info", "You took the Blue Pill");
            Toast.makeText(this, "You passed out", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Log.i("info", "You took the Red Pill");
            Toast.makeText(this, "You died", Toast.LENGTH_SHORT).show();
        }
    }
}
