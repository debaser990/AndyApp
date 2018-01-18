package com.example.akshat.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.util.Log;
public class MainActivity extends Activity {

    int count;
    Button add, sub;
    TextView display;
    //private static final String TAG = "LogMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = 0;
        add = (Button) findViewById(R.id.bAdd);
        sub = (Button) findViewById(R.id.bSub);
        display = (TextView) findViewById(R.id.tvDisplay);
        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count++;
                display.setText("your total is"+count);
               // Log.i(TAG,"onClick");
            }
        });
      sub.setOnClickListener(new View.OnClickListener(){
          public void onClick(View v)
          {
              count--;
              display.setText("your total is"+count);;
      //        Log.i(TAG,"onClick");
          }

      });
    }


}
