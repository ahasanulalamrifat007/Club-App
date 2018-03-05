package com.example.rifatrahat.clubapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by rifatrahat on 6/22/2017.
 */

class ClubWebsite extends ListActivity {



    public void backToMain(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        this.finish();   // this line close the current activity, when load the new activity
    }
}
