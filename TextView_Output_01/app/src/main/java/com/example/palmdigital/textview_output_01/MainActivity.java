package com.example.palmdigital.textview_output_01;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    // fields
    TextView textViewDisplayTop;
    TextView textViewDisplayMiddle;
    TextView textViewDisplayBottom;
    int num1, num2, sum;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create references for our UI Imageview
        ImageView imageViewObject1 = (ImageView) findViewById(R.id.imageView);
        imageViewObject1.setOnClickListener(this);

        ImageView imageViewObject2 = (ImageView) findViewById(R.id.imageView2);
        imageViewObject2.setOnClickListener(this);

        ImageView imageViewObject3 = (ImageView) findViewById(R.id.imageView3);
        imageViewObject3.setOnClickListener(this);

        ImageView imageViewObject4 = (ImageView) findViewById(R.id.imageView_plus);

        ImageView imageViewObject5 = (ImageView) findViewById(R.id.imageView5);
        imageViewObject5.setOnClickListener(this);

        ImageView imageViewObject6 = (ImageView) findViewById(R.id.imageView6);
        imageViewObject6.setOnClickListener(this);

        ImageView imageViewObject7 = (ImageView) findViewById(R.id.imageView7);
        imageViewObject7.setOnClickListener(this);

        ImageView imageViewObject8 = (ImageView) findViewById(R.id.imageView_equal);
        imageViewObject8.setOnClickListener(this);

        textViewDisplayTop = (TextView) findViewById(R.id.textView);
        textViewDisplayMiddle = (TextView) findViewById(R.id.textView2);
        textViewDisplayBottom = (TextView) findViewById(R.id.textView3);

    } // end of onCreate()
    public void onClick(View view)
    {
        if (view.getId() == R.id.imageView)
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
        else if (view.getId() == R.id.imageView5)
        {
            textViewDisplayMiddle.setText("4");
            num2 = 4;
        }
        else if (view.getId() == R.id.imageView6)
        {
            textViewDisplayMiddle.setText("5");
            num2 = 5;
        }
        else if (view.getId() == R.id.imageView7)
        {
            textViewDisplayMiddle.setText("6");
            num2 = 6;
        }
        else if (view.getId() == R.id.imageView_equal)
        {
            // equal sign
            sum = num1 + num2;
            textViewDisplayBottom.setText("" + sum);
        }

    }
}
