package com.example.calander;

import android.app.DatePickerDialog;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.time.MonthDay;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    DatePicker dt;
    Button btn1;
    String s;

    TextView datetext;


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        btn1 = findViewById(R.id.datebtn);
        datetext = findViewById(R.id.datetext);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "The Current Date is "+ dt.getDayOfMonth()+"/" +(dt.getMonth()+1)+"/"+dt.getYear() ,Toast.LENGTH_LONG).show();
                Calendar c = Calendar.getInstance();
                int day = c.get(Calendar.DAY_OF_MONTH);
                int month = c.get(Calendar.MONTH);
                int year = c.get(Calendar.YEAR);

                DatePickerDialog d= new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int y, int m, int dom) {
                        s = dom +"-"+ (m +1)+ "-"+y;
                        Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
                        datetext.setText(s);
                    }
                },year,month,day);
                d.show();
            }
        });
    }
}