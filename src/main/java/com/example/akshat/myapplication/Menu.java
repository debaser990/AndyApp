package com.example.akshat.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Akshat on 30-01-2017.
 */

public class Menu extends ListActivity{

    String classes[]={"MainActivity","Splash","TextPlay","Email"};
    @Override
    protected void onStart() {
        super.onStart();
        setListAdapter(new ArrayAdapter<String>(Menu.this,android.R.layout.simple_list_item_1,classes));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String cl=classes[position];
        try {
            Class ourClass=Class.forName("com.example.akshat.myapplication."+cl);
            Intent inten=new Intent(Menu.this, ourClass);
             startActivity(inten);
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    }
}
