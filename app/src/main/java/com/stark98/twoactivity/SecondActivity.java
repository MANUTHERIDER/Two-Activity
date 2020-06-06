package com.stark98.twoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String message= intent.getStringExtra(MainActivity.Extra_Message);
        TextView textView= findViewById(R.id.text_message);
        textView.setText(message);
        Intent intent1 = getIntent();
        String mesage = intent1.getStringExtra(MainActivity.Extra_Message1);

    }


}