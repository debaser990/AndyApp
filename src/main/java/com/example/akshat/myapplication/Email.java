package com.example.akshat.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Akshat on 02-02-2017.
 */

public class Email extends Activity implements View.OnClickListener {

    EditText emailAdd, intro,personsName,stupidThings,hatefulAction,outro;
    String emailids,begin,name,things,action,end;
    Button sendMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email);
        variablez();
        sendMail.setOnClickListener(this);
    }

    public void onClick(View v) {
        texts2strings();
        String emailaddresses[]={emailids};
        String message="Well hello"+name+"I wanted to say"+begin+"I hate you when"+things+"I want to"+action+"and finally i want to say "+end+"/n ps. I Love You ";
        Intent emailIntent =new Intent(Intent.ACTION_SEND);
        emailIntent.putExtra(Intent.EXTRA_EMAIL,emailaddresses);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT,"HATEMAIL");
        emailIntent.setType("plain/text");
        emailIntent.putExtra(Intent.EXTRA_TEXT,message);
        startActivity(emailIntent);

    }

    private void variablez(){
        emailAdd=(EditText) findViewById(R.id.etEmail);
        intro=(EditText) findViewById(R.id.etIntro);
        personsName=(EditText) findViewById(R.id.etPName);
        stupidThings=(EditText) findViewById(R.id.etThings);
        hatefulAction=(EditText) findViewById(R.id.etActions);
        outro=(EditText) findViewById(R.id.etOutro);
    }

    private void texts2strings(){
        emailids=emailAdd.getText().toString();
        begin=intro.getText().toString();
        name=personsName.getText().toString();
        things=stupidThings.getText().toString();
        action=hatefulAction.getText().toString();
        end=outro.getText().toString();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
