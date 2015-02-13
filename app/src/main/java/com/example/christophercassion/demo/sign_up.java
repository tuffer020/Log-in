//package com.example.christophercassion.demo;
//
//import android.support.v7.app.ActionBarActivity;
//
//
//
//public class sign_up extends ActionBarActivity {
//
//
//}
package com.example.christophercassion.demo;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sign_up extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        View.OnClickListener listnr4;
        listnr4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(sign_up.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        };
        Button btli;
        btli = (Button) findViewById(R.id.btli);
        btli.setOnClickListener(listnr4);
    }
}