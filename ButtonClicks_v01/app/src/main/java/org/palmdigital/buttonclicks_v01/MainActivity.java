package org.palmdigital.buttonclicks_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button button = (Button) findViewById(R.id.button);
    }
    public void getName(View v)
    {
        Toast.makeText(this, "This Button Worked", Toast.LENGTH_SHORT).show();
    }

    public void textMethod (View dog)
    {
        Toast.makeText(this, "Testing Second Button", Toast.LENGTH_SHORT).show();
    }
}
