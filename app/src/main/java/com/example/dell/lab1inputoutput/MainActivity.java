package com.example.dell.Lab1InputOutput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dell.lab1inputoutput.R;

public class MainActivity extends AppCompatActivity {

    TextView tvMessage;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                tvMessage = (TextView) findViewById(R.id.textView);
                submitButton = (Button) findViewById(R.id.button);
    }

    public void displayText (View view){
        tvMessage.setText("Welcome!");
    }
}
