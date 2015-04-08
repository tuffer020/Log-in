package com.example.christophercassion.demo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class reservation extends ActionBarActivity {

    int day;
    int month;
    int year;

    //int month = date.getInt("month");
    //int year = date.getInt("year");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
        Bundle date = getIntent().getExtras();
        day = date.getInt("day");
        month = date.getInt("month");
        year = date.getInt("year");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_reservation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        Toast newToast = Toast.makeText(getApplicationContext(), month + "/" + day + "/" + year, Toast.LENGTH_SHORT);
        newToast.show();
        return super.onOptionsItemSelected(item);
    }
}
