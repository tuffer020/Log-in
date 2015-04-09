package com.example.christophercassion.demo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class reservation extends ActionBarActivity implements AdapterView.OnItemSelectedListener {

    int day;
    int month;
    int year;
    String spinner_select;
    private TextView selection;

    private static final String[] items={"Option 1", "Option 2", "Option 3"};

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

        selection=(TextView)findViewById(R.id.selection);

        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        spinner.setOnItemSelectedListener(this);
//        spinner_select = spinner.getSelectedItem().toString();
//      Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.array_options, android.R.layout.simple_spinner_item);
//      Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//      Apply the adapter to the spinner
        spinner.setAdapter(adapter);

    }

//    public void onItemSelected(AdapterView<?> parent,
//                               View view, int pos, long id) {
//        spinner_select = parent.getItemAtPosition(pos).toString();
//    }
//
//    public void onNothingSelected(AdapterView<?> arg0) {
//        // TODO Auto-generated method stub
//
//    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_reservation, menu);



        return true;
    }

    public void onItemSelected(AdapterView<?> parent,
                               View v, int position, long id) {
        selection.setText(items[position]);
        Toast newToast = Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_SHORT);
        newToast.show();
    }

    public void onNothingSelected(AdapterView<?> parent) {
        selection.setText("");
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

        return super.onOptionsItemSelected(item);
    }
}
