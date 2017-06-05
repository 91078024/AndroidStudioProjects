package com.example.palmdigital.clickableimageview01;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageObject_01 = (ImageView)findViewById(R.id.imageView1);
        imageObject_01.setOnClickListener(this);

        ImageView imageObject_02 = (ImageView)findViewById(R.id.imageView2);
        imageObject_02.setOnClickListener(this);

        ImageView imageObject_03 = (ImageView)findViewById(R.id.imageView3);
        imageObject_03.setOnClickListener(this);

    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.imageView1)
        {
            Log.i("info", "You selected contacts");
            Toast.makeText(this, "You selected contacts", Toast.LENGTH_SHORT).show();
        }
        else if (view.getId() == R.id.imageView2)
        {
            Log.i("info", "You selected Email");
            Toast.makeText(this, "You selected Email", Toast.LENGTH_SHORT).show();
        }
        else (view.getId() == R.id.imageView3)
        {
            Log.i("info", "You selected messages");
            Toast.makeText(this, "You selected messages", Toast.LENGTH_SHORT).show();
        }
    }
}
