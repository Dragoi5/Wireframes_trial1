package com.example.wireframes_trial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_temp);

        ImageView home = findViewById(R.id.homeIcon);
        ImageView resources = findViewById(R.id.resourcesIcon);
        ImageView blog = findViewById(R.id.blogIcon);
        ImageView profile = findViewById(R.id.profileIcon);
        TextView profileAlerts = findViewById(R.id.profileAlerts);

        Helper startup = new Helper("p",this,home,resources,blog,profile);
        profileAlerts.setText("");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        System.out.println("executed");
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_profile, menu);
        return true;
    }
}