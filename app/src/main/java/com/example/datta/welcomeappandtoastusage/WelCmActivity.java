package com.example.datta.welcomeappandtoastusage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class WelCmActivity extends Activity {

EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wel_cm);
        et=(EditText)findViewById(R.id.editText);


    }
    public void show(View view)
    {
        Toast.makeText(this,"U have clicked button",Toast.LENGTH_LONG).show();   // uasage of toast..

        Log.d("in welcmActiviy", "in show()");
        String data=et.getText().toString();
        Intent i=new Intent(this,DisplayActivity.class);
        i.putExtra("LABEL", data);
        startActivity(i);



    }
}