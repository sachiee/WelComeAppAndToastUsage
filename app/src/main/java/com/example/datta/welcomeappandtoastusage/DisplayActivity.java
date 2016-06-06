package com.example.datta.welcomeappandtoastusage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class DisplayActivity extends Activity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        tv=(TextView)findViewById(R.id.txtchg);
        Intent v=getIntent();
        String data=v.getStringExtra("LABEL");
        tv.setText(data);                          // insteading creating new TextView Obj...
       // setContentView(tv);                     // configuring using .xml file...
	   
	   
	   
	   /* String temp=intent.getStringExtra("INPUT");
        tv=new TextView(this);
        tv.setText("Welcome "+temp+" Congrats");                     // wev can do lyk dis also...
        tv.setAllCaps(true);
        setContentView(tv);*/

    }
}