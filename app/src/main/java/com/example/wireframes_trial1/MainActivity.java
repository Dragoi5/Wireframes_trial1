package com.example.wireframes_trial1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Define elements on page
    EditText username;
    EditText password;
    Button signUp;
    Button login;

    ImageView home;
    ImageView resources;
    ImageView blog;
    ImageView profile;
    ConstraintLayout page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set elements to page
        username =findViewById(R.id.username);
        password =findViewById(R.id.password);
        signUp = findViewById(R.id.signUp);
        login = findViewById(R.id.login);

        // Override onclick methods
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // To-do
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tryLogin();
            }
        });
    }

    public void tryLogin(){
//        LogIn logIn = LogIn.getInstance();
        if(tempLoginCode(username,password)) {
            Intent intent = new Intent(MainActivity.this, Home.class);
            startActivity(intent);
        }
    }

    // Change after implimenting firebase
    public boolean tempLoginCode(EditText username, EditText password){

        // Try login code - change with firebase later
        if(username.getText().toString().equals("aa")){
            if(password.getText().toString().equals("a")){
                Toast.makeText(getApplicationContext(), "Weclome PEOPLE",Toast.LENGTH_LONG).show();
                return true;
            }
            password.setError("Incorrect Password");
            return false;
        } else{
            username.setError("Invalid Username");
            Toast.makeText(getApplicationContext(), "Invalid username, consider signing up",Toast.LENGTH_LONG).show();
            return false;
        }
    }

    public void overrideSubmenu(int page){

    }
}