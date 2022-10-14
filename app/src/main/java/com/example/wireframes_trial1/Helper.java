package com.example.wireframes_trial1;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class Helper {
    Context current;
    ImageView home;
    ImageView resources;
    ImageView blog;
    ImageView profile;


    public Helper(String page, Context thisClass, ImageView home, ImageView resources, ImageView blog, ImageView profile){
        current = thisClass;
        this.home = home;
        this.resources = resources;
        this.blog = blog;
        this.profile = profile;
        navigationBar(page);
    }

    public void navigationBar(String currentPage){
        // All strings must be in lower case
        String[] homeNames = {"home","h"};
        String[] resourcesName = {"resources","r","resource"};
        String[] blogNames = {"blog", "b"};
        String[] profileNames = {"profile","p","profiles"};

        // Execute other function based on whether they are in that group
        String[][] list = {homeNames, resourcesName, blogNames, profileNames};
        for(int i = 0; i!= list.length; i++){
            for(String j: list[i]){
                if(currentPage.toLowerCase().equals(j.toLowerCase())){
                    navigationBar(i+1);
                    return;
                }
            }
        }
        Log.e("Invalid Method Input","Invalid input - helper class");
        return;
    }

    public void navigationBar(int currentPage){
        if(currentPage != 1){
            home.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(current, MainActivity.class);
                    current.startActivity(intent);
                }
            });
        }
        if(currentPage != 2){
            resources.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(current, MainActivity.class);
                    current.startActivity(intent);
                }
            });
        }
        if(currentPage != 3){
            blog.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(current, MainActivity.class);
                    current.startActivity(intent);
                }
            });
        }
        if(currentPage != 4){
            profile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(current, MainActivity.class);
                    current.startActivity(intent);
                }
            });
        }
        return;
    }
}
