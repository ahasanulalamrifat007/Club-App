package com.example.rifatrahat.clubapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by rifatrahat on 7/5/2017.
 */

public class ExecutiveMembers extends AppCompatActivity {





    public void backToMain(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        this.finish();   // this line close the current activity, when load the new activity
    }
}
