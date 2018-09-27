package com.example.wilder.blbla;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static java.util.Locale.*;

public class TripModel {


    String firstname;
    String lastname;
    Date date;
    int price;
    public TripModel(String firstname, String lastname, Date date, int price){
        this.firstname=firstname;
        this.lastname=lastname;
        this.date=date;
        this.price=price;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }


    public int getPrice() {

        return this.price;
    }





   public String getDate() {
       DateFormat df = new SimpleDateFormat("MM/dd/yyyy kk:mm" , FRANCE);
       String strDate = df.format(date);
        return strDate;
    }






    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
