package com.example.nishat_dadi.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button nextbutton;
    private Button previousbutton;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextbutton = (Button) findViewById(R.id.nextbutton);
        previousbutton = (Button) findViewById(R.id.previousbutton);
        textview =  (TextView) findViewById(R.id.textview);
    }

    public void showMessage(View v)
    {
        if(v.getId()==R.id.nextbutton) {
            Toast.makeText(MainActivity.this,"Next Button is clicked!!!",Toast.LENGTH_SHORT).show();
        }
        else if (v.getId()==R.id.previousbutton) {
            Toast.makeText(MainActivity.this,"Previous Button is clicked!!!",Toast.LENGTH_SHORT).show();
        }

    }
}
