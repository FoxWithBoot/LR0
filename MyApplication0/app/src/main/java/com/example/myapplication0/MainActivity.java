package com.example.myapplication0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView myTxt;
    Button but1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTxt = (TextView)findViewById(R.id.myText);
        but1 = (Button)findViewById(R.id.button1);
        but1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        myTxt.setText("I like Android!");
    }
}
