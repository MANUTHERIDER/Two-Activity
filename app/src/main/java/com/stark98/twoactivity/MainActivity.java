package com.stark98.twoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String Extra_Message= "com.stark98.twoactivity.extra.MESSAGE";
    public static final String Extra_Message1= "com.stark98.twoactivity.extra.MESSAGE";
    private EditText mMessageEditText;
    private EditText getName, getContact, getEmail, getAdd;

    private static final String LOG_TAG= MainActivity.class.getSimpleName();
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessageEditText=findViewById(R.id.editText_main);
        getName=findViewById(R.id.editTextPersonName);
        getAdd=findViewById(R.id.editTextAddress);
        getContact=findViewById(R.id.editTextContactNumber);
        getEmail=findViewById(R.id.editTextEmailAddress);
    }

    public void launchSecondActivity(View view) {
        Log.d( LOG_TAG ,"Button clicked");
        Intent intent=new Intent(this, SecondActivity.class);
        String message= mMessageEditText.getText().toString();
        intent.putExtra(Extra_Message, message);
        startActivity(intent);
    }

    public void launchSecondActivity2(View view) {
        Intent intent1=new Intent(this, SecondActivity.class);
        String name= "Welcome "+getName.getText().toString();
        String add= " \nFrom: "+getAdd.getText().toString();
        String phn= " \nContact Number: "+getContact.getText().toString();
        String email= " \nEmail ID: "+getEmail.getText().toString()+"\n";
        String msg= name+add+phn+email+"Thanks for reaching us , We will get back to You.\n"+"Your Patience is appreciated";
        intent1.putExtra(Extra_Message1, msg);
        startActivity(intent1);
    }
}