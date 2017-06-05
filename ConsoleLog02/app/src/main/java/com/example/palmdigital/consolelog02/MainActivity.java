package com.example.palmdigital.consolelog02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{
//field - class level variables
    private int myInt;
    private double myDouble;
    private String myString;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myInt = setIntValue();
        Log.i("info", "myInt = " + myInt);
        double myDouble = setDoubleValue(); // myDouble should be set to 10.987
        Log.i("info", "myDouble = " + myDouble);

        boolean myBoolean = setBooleanValue(); // should be false
        Log.i("info", "MyBoolean = " + myBoolean);

        float myFloat = setFloatValue();
        Log.i("info", "MyFloat = " + myFloat);

        // declare a float variable called myFloat
        // set its value with a function you write setFloatValue
        // have your function return the sum of two floats (4.5 + 2.3)
        // Log myFloat out to Android Monitor logcat

    }

    public float setFloatValue()
    {
        return 4.5f + 2.3f;
    }


    public boolean setBooleanValue()
    {
        return false;
    }

    public double setDoubleValue()
    {
        return 10.987;
    }

    public int setIntValue()
    {
        return 10;
    }
}
