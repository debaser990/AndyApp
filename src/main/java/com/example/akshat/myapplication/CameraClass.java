/*
package com.example.akshat.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by Akshat on 03-02-2017.
 */
/*
public class CameraClass extends Activity implements View.OnClickListener {

    ImageView iv;
    ImageButton ib;
    Button b;
    Intent i;
  final static  int cameradata=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo);
        initialize();
       ib.setOnClickListener(this);
        b.setOnClickListener(this);
    }

    private void initialize(){
        iv=(ImageView) findViewById(R.id.ivReturnPic);
        ib=(ImageButton) findViewById(R.id.ibTakePic);
        b=(Button) findViewById(R.id.bSetWall);

    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case  R.id.bSetWall:
            i= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
               startActivityForResult(i,cameradata);
                break;

            case  R.id.ibTakePic :

                    break;

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==RESULT_OK)

    }
}
*/