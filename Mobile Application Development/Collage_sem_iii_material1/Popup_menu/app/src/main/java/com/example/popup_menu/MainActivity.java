package com.example.popup_menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.menu);
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                PopupMenu popupMenu = new PopupMenu(MainActivity.this,b);
//                popupMenu.getMenuInflater().inflate(R.menu.a, popupMenu.getMenu());
//                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//                    @Override
//                    public boolean onMenuItemClick(MenuItem menuItem) {
//                        Toast.makeText(MainActivity.this, "This is a my menu",+ menuItem.getItemId() + Toast.LENGTH_SHORT).show();
//                        return true;
//                    }
//                });
//                popupMenu.show();
//
//
//            }
//        });
        b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this,b);
                popupMenu.getMenuInflater().inflate(R.menu.a, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        Toast.makeText(MainActivity.this, "This is a my menu",+ menuItem.getItemId() + Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });
                popupMenu.show();
                return true;
            }
        });
    }
}