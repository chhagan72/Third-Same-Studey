package com.example.alert_with_singlechoice;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String[] toppings ={"MCA","MBA","MCS","BCA","BCS"};
    ArrayList<Integer> arrayList = new ArrayList<>();
    String msg="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.b1);
        TextView RS = (TextView) findViewById(R.id.Result);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Choose Your Toppings.")
                        .setSingleChoiceItems(toppings, -1, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                RS.setText(toppings[i]);
                                dialogInterface.dismiss();
                            }
                        });
                AlertDialog mDialog = builder.create();
                mDialog.show();

            }
        });
    }
}

