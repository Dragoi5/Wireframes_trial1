package com.example.wireframes_trial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ImageView;

public class Resources extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);

        ImageView home = findViewById(R.id.homeIcon);
        ImageView resources = findViewById(R.id.resourcesIcon);
        ImageView blog = findViewById(R.id.blogIcon);
        ImageView profile = findViewById(R.id.profileIcon);
        Helper startup = new Helper("r",this,home,resources,blog,profile);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        System.out.println("executed");
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }
}