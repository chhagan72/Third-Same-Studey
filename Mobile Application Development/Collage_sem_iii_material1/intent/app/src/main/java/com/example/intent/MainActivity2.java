package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent a = getIntent();
        String b = a.getStringExtra("key");
        TextView t = (TextView) findViewById(R.id.tv);
        t.setText("Welcome "+b+" !!!!");
    }
}