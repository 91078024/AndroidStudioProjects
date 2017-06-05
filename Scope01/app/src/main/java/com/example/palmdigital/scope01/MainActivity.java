package com.example.palmdigital.scope01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

// We are outside the MainActivity class
// We are outside any method

// Understanding hope scope works is very important!


public class MainActivity extends AppCompatActivity
{
    // in the MainActivity class, nut I'm outside any Methods

    // fields - these variables have class wide scope -- any code in the class can see
//          and use these variables
    String myString;
    // declare a field that is a double named enemyHealth
    Double enemyHealth;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // here, we are inside the onCreate() method, which is inside
        // the MainActivity class

        // when we 'declare' or 'define' a variable, we use the following format:
        // dataType variblreName; <---- this is a varible declaration/definition
        // some examples:

        int myInt; // <--- this is declaring a varible of dataType 'int' and named 'myInt'
        double myDouble; // <--- this is declaring a variable of dataType 'double' named 'myDouble'
        TextView textView_story; //<--- this is declaring a variable of dataType 'TextView' named
                                        // textView_story
        ImageView imageview_ex; //<--- dataType is ImageView, variableName is imageView_ex

        // assigning a value to declare variable
        // after we declare a variable, we can assign a value to it
        // variableName = someValueOfTheSameDataTypeAsTheVariable;
        // some examples:
        myInt = 10; //<-- setting the value of myInt to 10, myInt has dataType 'int' & 10 is an int
        myDouble = 20.12; // myDouble gets the value 20.12
        textView_story = (TextView) findViewById(R.id.textView_st); // set the value of
                                                            // textView_story to UI element
                                                            // R.id.textView_st
        imageview_ex = (ImageView) findViewById(R.id.imageView_andriod_guy);

        // you know you can declare and assign in the same step
        // dataType variableName = someValueOfTheSameDataTypeAsTheVariable;
        // Some examples:
        int myInt2 = 25; // <--- this is a declaration AND assignment
        myInt2 = 50; // <--- this is only assignment
        // THE DEFERANCE IS the dataType!!!!!!!!!! 'int'
        myString = "this is a string"; // <--- a declaration AND a assignment
        myString = "this is another string!"; // this is just assignment
        //!!!!!!!!!!!!!!!! Wherever you declare a variable determines that variable's scope!!!!!!
        // in other words, if I declare a varible here in the onCreate() method, only
        // code in the onCreate() method can see it... let's prove this...
        enemyHealth = 20.5;
    } // end of onCreate Method

    public void myAwesomeMethod01()
    {
       myString = "what's going on here...";
        enemyHealth = 10.2;
    } // end of myAwesomeMethod01()

    public  void myAwesomeMethod02()
    {
        enemyHealth = 5.3;
    }// end of myAwesomeMethod02()

} // end of class
