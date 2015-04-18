package com.example.christophercassion.demo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class rewards_page extends ActionBarActivity {

    int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        /*
            This is the text view to show the reward points.
            I created a global variable for POINTS. All you
            have to do is to pull the info from there, assign it to
             point, and it will print out the correct value.
             I set it as a INT, if its not an int, change it
             and it will work the same way
         */

        setContentView(R.layout.activity_rewards_page);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rewards_page, menu);



        //GO BACK TO COMPANY PAGE
        View.OnClickListener listnr8;
        listnr8 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(rewards_page.this, company_page.class);
                startActivity(j);
                //finish();
            }
        };
        Button b8 =(Button) findViewById(R.id.backFromRewards);
        b8.setOnClickListener(listnr8);



        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //String str = "Current amount of Reward Points: ";



        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void OnButtonClickChangeTextOfTextView(View v){
        TextView reward_point = (TextView)findViewById(R.id.points_view);
        reward_point.setText("Current amount of Points: " + points);
    }

}
