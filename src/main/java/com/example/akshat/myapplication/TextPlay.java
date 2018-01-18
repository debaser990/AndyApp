package com.example.akshat.myapplication;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.Random;

/**
 * Created by Akshat on 31-01-2017.
 */

public class TextPlay extends Activity implements View.OnClickListener  {

   TextView display;
   Button chkcmd;
   ToggleButton tb;
   EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sometext);
        sexyMethod();
        tb.setOnClickListener(this);
        chkcmd.setOnClickListener(this);
    }

    private void sexyMethod() {
        display = (TextView) findViewById(R.id.textView);
        chkcmd = (Button) findViewById(R.id.Trybutton);
        tb = (ToggleButton) findViewById(R.id.togbutton);
        input = (EditText) findViewById(R.id.et);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case 0:int a= R.id.togbutton;
                if(tb.isChecked())
                    input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                else
                    input.setInputType(InputType.TYPE_CLASS_TEXT);
                break;
            case 1: int b=R.id.Trybutton;
                String check = input.getText().toString();
                display.setText(check);
                if (check.contentEquals("left")) {
                    display.setGravity(Gravity.LEFT);
                } else if (check.contentEquals("center")) {
                    display.setGravity(Gravity.CENTER);
                } else if (check.contentEquals("right")) {
                    display.setGravity(Gravity.RIGHT);
                } else if (check.contentEquals("blue")) {
                    display.setTextColor(Color.BLUE);
                } else {
                    Random rd = new Random();
                    display.setText("WTF!!!");
                    display.setTextSize(rd.nextInt(75));
                    display.setTextColor(Color.rgb(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
                    switch (rd.nextInt(3)) {
                        case 0:
                            display.setGravity(Gravity.LEFT);
                            break;
                        case 1:
                            display.setGravity(Gravity.CENTER);
                            break;
                        case 2:
                            display.setGravity(Gravity.RIGHT);
                            break;
                    }
                }
                break;
        }
    }
}
