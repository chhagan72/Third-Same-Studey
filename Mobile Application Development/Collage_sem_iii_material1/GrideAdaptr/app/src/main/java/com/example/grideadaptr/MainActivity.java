package com.example.grideadaptr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int coding[]={R.drawable.ck,R.drawable.ck2,R.drawable.ck3,R.drawable.ck5,R.drawable.ck6};
    String[] name = {"prog1","prog2","prog3","prog4","prog5"};
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (android.widget.GridView) findViewById(R.id.gridview);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(),coding);
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"You choose " + name[i],Toast.LENGTH_LONG).show();
            }
        });
    }
}
