package com.example.palmdigital.button02;

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

        Button buttonObject1 = (Button)findViewById(R.id.buttonMyButton1);
        buttonObject1.setText("CLICK BAIT!");
        buttonObject1.setOnClickListener(this);

    } // end of onCreate method
    public void onClick(View view)
    {
        Log.i("info", "Hey, you pressed Button 1!!");
        Toast.makeText(MainActivity.this, "Self destruct in 3..2..1..", Toast.LENGTH_SHORT).show();
    }
} // end of MainActivity class
