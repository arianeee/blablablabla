package com.example.wilder.blbla;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import android.app.ActionBar;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.Toast;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import static com.example.wilder.blbla.R.id.TVDes;

import static com.example.wilder.blbla.R.id.TVdep;
import static com.example.wilder.blbla.R.id.button_search_iti;
import static com.example.wilder.blbla.R.id.message;

public class ItinerarySearchActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.voyage";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary_search);
        Intent intent = new Intent(ItinerarySearchActivity.this, ItineraryListActivity.class);
        EditText depart = findViewById(R.id.TVdep);
        EditText destination = findViewById(R.id.TVDes);
        //final EditText date= findViewById(R.id.ETDate);

        String departt = depart.getText().toString();
        String destinationt = destination.getText().toString();
        //final Calendar myCalendar = Calendar.getInstance();

        final Button button2 = (Button) findViewById(R.id.button_search_iti);
        //Intent intent = new Intent(ItinerarySearchActivity.this, ItineraryListActivity.class);
        //EditText depart= findViewById(R.id.TVdep);

        button2.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                /*Intent intent = new Intent(ItinerarySearchActivity.this, ItineraryListActivity.class);*/
                EditText depart = findViewById(R.id.TVdep);
                EditText destination = findViewById(R.id.TVDes);
                String departt = depart.getText().toString();
                String destinationt = destination.getText().toString();


                if ((destinationt.isEmpty() || departt.isEmpty())) {

                    Toast.makeText(ItinerarySearchActivity.this, "Please complete your travel's informations", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(ItinerarySearchActivity.this, ItineraryListActivity.class);
                    //String departt = depart.getText().toString();
                    //String destinationt = destination.getText().toString();

                    String voyage = departt + ">" + destinationt;
                    intent.putExtra(EXTRA_MESSAGE, voyage);
                    startActivity(intent);
                }

            }

        });

        final Calendar myCalendar = Calendar.getInstance();
        final EditText editdate = findViewById(R.id.ETDate);

        final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            private void updateLabel() {
                String myFormat = "MM/dd/yy"; //In which you need put here
                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

                editdate.setText(sdf.format(myCalendar.getTime()));}

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {

                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }

        };
        //Calendar myCalendar = Calendar.getInstance();
        //EditText editdate= findViewById(R.id.ETDate);
        editdate.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                // TODO Auto-generated method stub
                new DatePickerDialog(ItinerarySearchActivity.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });


    }
}


            // })*/


        //}