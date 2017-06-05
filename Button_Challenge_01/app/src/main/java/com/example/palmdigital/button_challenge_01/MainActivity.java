package com.example.palmdigital.button_challenge_01;

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

        Button buttonObject01 = (Button)findViewById(R.id.button1);
        buttonObject01.setText("Contacts");
        buttonObject01.setBackgroundColor(0xffff00ff);
        buttonObject01.setOnClickListener(this);

        Button buttonObject02 = (Button)findViewById(R.id.button2);
        buttonObject02.setText("Email");
        buttonObject02.setBackgroundColor(0xff00ffff);
        buttonObject02.setOnClickListener(this);

        Button buttonObject03 = (Button)findViewById(R.id.button3);
        buttonObject03.setText("Messages");
        buttonObject03.setBackgroundColor(0xffff0000);
        buttonObject03.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.button1)
        {
            Toast.makeText(this, "You selected Contacts!", Toast.LENGTH_SHORT).show();
            Log.i("Info","You selected Contacts!");
        }
        if (view.getId() == R.id.button2)
        {
            Toast.makeText(this, "You selected Email!", Toast.LENGTH_SHORT).show();
            Log.i("Info","You selected Email!");
        }
        if (view.getId() == R.id.button3)
        {
            Toast.makeText(this, "You selected Messages!", Toast.LENGTH_SHORT).show();
            Log.i("Info","You selected Messages!");
        }
    }
}
