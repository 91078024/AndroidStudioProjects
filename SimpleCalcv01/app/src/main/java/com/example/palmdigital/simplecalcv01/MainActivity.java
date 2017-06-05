package com.example.palmdigital.simplecalcv01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener

{
    TextView textViewDisplayTop;
    TextView textViewDisplayMiddle;
    TextView textViewDisplayBottom;

    int operator;

    ImageView imageViewObject00;
    ImageView imageViewObject01;
    ImageView imageViewObject02;
    ImageView imageViewObject03;
    ImageView imageViewObject04;
    ImageView imageViewObject05;
    ImageView imageViewObject06;
    ImageView imageViewObject07;
    ImageView imageViewObject08;
    ImageView imageViewObject09;
    ImageView imageViewObject10;
    ImageView imageViewObject11;
    ImageView imageViewObject12;
    ImageView imageViewObject13;
    ImageView imageViewObject14;
    ImageView imageViewObject15;
    ImageView imageViewObject16;
    ImageView imageViewObject17;
    ImageView imageViewObject18;
    ImageView imageViewObject19;
    ImageView imageViewObjectEqual;
    ImageView imageViewObjectPlus;
    ImageView imageViewObjectMinus;

    int num1;
    int num2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewObject00 = (ImageView) findViewById(R.id.imageView);
        imageViewObject00.setOnClickListener(this);

        imageViewObject01 = (ImageView) findViewById(R.id.imageView1);
        imageViewObject01.setOnClickListener(this);

        imageViewObject02 = (ImageView) findViewById(R.id.imageView2);
        imageViewObject02.setOnClickListener(this);

        imageViewObject03 = (ImageView) findViewById(R.id.imageView3);
        imageViewObject03.setOnClickListener(this);

        imageViewObject04 = (ImageView) findViewById(R.id.imageView4);
        imageViewObject04.setOnClickListener(this);

        imageViewObject05 = (ImageView) findViewById(R.id.imageView5);
        imageViewObject05.setOnClickListener(this);

        imageViewObject06 = (ImageView) findViewById(R.id.imageView6);
        imageViewObject06.setOnClickListener(this);

        imageViewObject07 = (ImageView) findViewById(R.id.imageView7);
        imageViewObject07.setOnClickListener(this);

        imageViewObject08 = (ImageView) findViewById(R.id.imageView8);
        imageViewObject08.setOnClickListener(this);

        imageViewObject09 = (ImageView) findViewById(R.id.imageView9);
        imageViewObject09.setOnClickListener(this);

        imageViewObject10 = (ImageView) findViewById(R.id.imageView10);
        imageViewObject10.setOnClickListener(this);

        imageViewObject11 = (ImageView) findViewById(R.id.imageView11);
        imageViewObject11.setOnClickListener(this);

        imageViewObject12 = (ImageView) findViewById(R.id.imageView12);
        imageViewObject12.setOnClickListener(this);

        imageViewObject13 = (ImageView) findViewById(R.id.imageView13);
        imageViewObject13.setOnClickListener(this);

        imageViewObject14 = (ImageView) findViewById(R.id.imageView14);
        imageViewObject14.setOnClickListener(this);

        imageViewObject15 = (ImageView) findViewById(R.id.imageView15);
        imageViewObject15.setOnClickListener(this);

        imageViewObject16 = (ImageView) findViewById(R.id.imageView16);
        imageViewObject16.setOnClickListener(this);

        imageViewObject17 = (ImageView) findViewById(R.id.imageView17);
        imageViewObject17.setOnClickListener(this);

        imageViewObject18 = (ImageView) findViewById(R.id.imageView18);
        imageViewObject18.setOnClickListener(this);

        imageViewObject19 = (ImageView) findViewById(R.id.imageView19);
        imageViewObject19.setOnClickListener(this);

        imageViewObjectEqual = (ImageView) findViewById(R.id.imageViewEqual);
        imageViewObjectEqual.setOnClickListener(this);

        imageViewObjectPlus = (ImageView) findViewById(R.id.imageViewPlus);
        imageViewObjectPlus.setOnClickListener(this);

        imageViewObjectMinus = (ImageView) findViewById(R.id.imageViewMinus);
        imageViewObjectMinus.setOnClickListener(this);

        textViewDisplayTop = (TextView) findViewById(R.id.textView_top);
        textViewDisplayTop.setOnClickListener(this);

        textViewDisplayMiddle = (TextView) findViewById(R.id.textView_Middle);
        textViewDisplayMiddle.setOnClickListener(this);

        textViewDisplayBottom = (TextView) findViewById(R.id.textView_Bottom);
        textViewDisplayBottom.setOnClickListener(this);

    }
    public void onClick(View view)
    {

        if (view.getId() == R.id.imageView)
        {
            textViewDisplayTop.setText("0");
            num1 = 0;
        }

        else if (view.getId() == R.id.imageView1)
        {
            textViewDisplayTop.setText("1");
            num1 = 1;
        }
        else if (view.getId() == R.id.imageView2)
        {
            textViewDisplayTop.setText("2");
            num1 = 2;
        }
        else if (view.getId() == R.id.imageView3)
        {
            textViewDisplayTop.setText("3");
            num1 = 3;
        }
        else if (view.getId() == R.id.imageView4)
        {
            textViewDisplayTop.setText("4");
            num1 = 4;
        }
        else if (view.getId() == R.id.imageView5)
        {
            textViewDisplayTop.setText("5");
            num1 = 5;
        }
        else if (view.getId() == R.id.imageView6)
        {
            textViewDisplayTop.setText("6");
            num1 = 6;
        }
        else if (view.getId() == R.id.imageView7)
        {
            textViewDisplayTop.setText("7");
            num1 = 7;
        }
        else if (view.getId() == R.id.imageView8)
        {
            textViewDisplayTop.setText("8");
            num1 = 8;
        }
        else if (view.getId() == R.id.imageView9)
        {
            textViewDisplayTop.setText("9");
            num1 = 9;
        }
        else if (view.getId() == R.id.imageView10)
        {
            textViewDisplayMiddle.setText("0");
            num2 = 0;
        }
        else if (view.getId() == R.id.imageView11)
        {
            textViewDisplayMiddle.setText("1");
            num2 = 1;
        }
        else if (view.getId() == R.id.imageView12)
        {
            textViewDisplayMiddle.setText("2");
            num2 = 2;
        }
        else if (view.getId() == R.id.imageView13)
        {
            textViewDisplayMiddle.setText("3");
            num2 = 3;
        }
        else if (view.getId() == R.id.imageView14)
        {
            textViewDisplayMiddle.setText("4");
            num2 = 4;
        }
        else if (view.getId() == R.id.imageView15)
        {
            textViewDisplayMiddle.setText("5");
            num2 = 5;
        }
        else if (view.getId() == R.id.imageView16)
        {
            textViewDisplayMiddle.setText("6");
            num2 = 6;
        }
        else if (view.getId() == R.id.imageView17)
        {
            textViewDisplayMiddle.setText("7");
            num2 = 7;
        }
        else if (view.getId() == R.id.imageView18)
        {
            textViewDisplayMiddle.setText("8");
            num2 = 8;
        }
        else if (view.getId() == R.id.imageView19)
        {
            textViewDisplayMiddle.setText("9");
            num2 = 9;
        }
        else if (view.getId() == R.id.imageViewPlus)
        {
            operator = num1 + num2;
            imageViewObjectPlus.setBackgroundColor(0xff00ffff);
            imageViewObjectMinus.setBackgroundColor(0x00000000);
        }
        else if (view.getId() == R.id.imageViewMinus)
        {
            operator = num1 - num2;
            imageViewObjectMinus.setBackgroundColor(0xff00ffff);
            imageViewObjectPlus.setBackgroundColor(0x00000000);
        }
      else if (view.getId() == R.id.imageViewEqual)
        {
         //if(operator == 0)
         //{
           //  result = num1 + num2;
         //}
           // else if (operator == 1)
         //{
            // result = num1 - num2;
         //}
            textViewDisplayBottom.setText("" + operator);
        }

    } // end of onClick method

} // end of class
