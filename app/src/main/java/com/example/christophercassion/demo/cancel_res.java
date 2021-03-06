package com.example.christophercassion.demo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class cancel_res extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancel_res);

        /*
            This will just send them back to the company page.
            They will be UNABLE to go back.
            I required the email for the purposes of
            accessing the database
         */

        View.OnClickListener listnr4;
        listnr4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cancel_res.this, company_page.class);
                startActivity(i);
                finish();
            }
        };
        Button butt =(Button) findViewById(R.id.finish_cancellation);
        butt.setOnClickListener(listnr4);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cancel_res, menu);
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
        else if (id == R.id.Log_out){

            Intent i= new Intent(cancel_res.this, MainActivity.class);
            startActivity(i);
            finish();

            Context context = getApplicationContext();
            CharSequence text = "Logged out!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
