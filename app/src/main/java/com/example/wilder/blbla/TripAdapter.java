package com.example.wilder.blbla;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.wilder.blbla.R;
import com.example.wilder.blbla.TripModel;

import java.util.ArrayList;

public class TripAdapter extends ArrayAdapter<TripModel> {
    public TripAdapter(Context context, ArrayList<TripModel> trips) {
        super(context, 0, trips);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        TripModel trip = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layoutt, parent, false);
        }
        // Lookup view for data population
        TextView prenom = (TextView) convertView.findViewById(R.id.firstname);
        TextView nom = (TextView) convertView.findViewById(R.id.lastname);
        TextView date=(TextView) convertView.findViewById(R.id.dateheure);
        TextView price=(TextView)convertView.findViewById(R.id.prix);




        // Populate the data into the template view using the data object
        prenom.setText(trip.getFirstname());
        nom.setText(trip.getLastname());
        date.setText(trip.getDate());
        price.setText(String.valueOf(trip.getPrice()));


        // Return the completed view to render on screen
        return convertView;
    }







}



