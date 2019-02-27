package com.example.conn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        ListView lv = (ListView)findViewById(R.id.ml);
        helper h=new helper(getApplicationContext());
        lv.setAdapter(h.display());
    }
}
