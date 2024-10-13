package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText usernname;
    EditText password;
    CheckBox showpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = (Button) findViewById(R.id.loginButton);
        usernname = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        showpass = (CheckBox) findViewById(R.id.showPassword);

        showpass.setOnCheckedChangeListener((buttonview, isCheckd)->{
            if(isCheckd){
                password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
            else{
                password.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user1 = usernname.getText().toString();
                String p = password.getText().toString();

                if (user1.equals("chhagan") && p.equals("123")) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                    intent.putExtra("key", user1);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}