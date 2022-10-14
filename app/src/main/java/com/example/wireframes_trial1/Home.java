package com.example.wireframes_trial1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ImageView;

public class Home extends AppCompatActivity {
    ConstraintLayout page;
    ConstraintLayout homeContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView home = findViewById(R.id.homeIcon);
        ImageView resources = findViewById(R.id.resourcesIcon);
        ImageView blog = findViewById(R.id.blogIcon);
        ImageView profile = findViewById(R.id.profileIcon);

        Helper startup = new Helper("home",this,home,resources,blog,profile);
        startup.navigationBar("Home");
        page = findViewById(R.id.homePage);
        homeContent = findViewById(R.id.profileContent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        System.out.println("executed");
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_profile, menu);
        return true;
    }

}