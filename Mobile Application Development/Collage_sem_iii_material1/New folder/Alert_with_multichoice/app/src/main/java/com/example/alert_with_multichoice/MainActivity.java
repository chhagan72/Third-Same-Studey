package com.example.alert_with_multichoice;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String[] toppings ={"MCA","MBA","MCS","BCA","BCS"};
    ArrayList<Integer> arrayList = new ArrayList<>();
    String msg="";
    boolean[] checckedItems = new boolean [toppings.length];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Choose Your Toppings.")
                        .setMultiChoiceItems(toppings, checckedItems, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                                if(b){
                                    arrayList.add(i);
                                }
                                else if (arrayList.contains(i)){
                                    arrayList.remove(Integer.valueOf(i));
                                }
                            }
                        })
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                for (int a=0; a<arrayList.size(); a++){
                                    msg = msg+"\n"+":"+toppings[arrayList.get(a)];
                                }
                                Toast.makeText(MainActivity.this, "Total"+ arrayList.size(), Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "No option selected", Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

    }
}