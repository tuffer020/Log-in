//package com.example.christophercassion.demo;
//
//import android.support.v7.app.ActionBarActivity;
//
//
//
//public class MainActivity extends ActionBarActivity {
//
//
//}
package com.example.christophercassion.demo;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
//import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickListener listnr;
        listnr = new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this, sign_up.class);
                startActivity(i);
                finish();
            }
        };
        Button btn =(Button) findViewById(R.id.btn);
        btn.setOnClickListener(listnr);

//        //New thingy
//        OnClickListener listnr2;
//        listnr2 = new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent j= new Intent(MainActivity.this, MainActivity.class);
//                startActivity(j);
//            }
//        };
//        Button btli =(Button) findViewById(R.id.btli);
//        btli.setOnClickListener(listnr2);
    }
}