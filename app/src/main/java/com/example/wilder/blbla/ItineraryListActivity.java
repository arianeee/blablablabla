package com.example.wilder.blbla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ItineraryListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary_list);
        Intent intent = getIntent();
        String voyage = intent.getStringExtra(ItinerarySearchActivity.EXTRA_MESSAGE);
        this.setTitle(voyage);


    }
}
