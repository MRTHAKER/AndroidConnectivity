package com.example.conn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText id=(EditText)findViewById(R.id.id);
        final EditText name=(EditText)findViewById(R.id.name);
        final TextView display=(TextView)findViewById(R.id.distxt);
        final Button insert=(Button)findViewById(R.id.insert);
        final Button update=(Button)findViewById(R.id.update);
        final Button delete=(Button)findViewById(R.id.delete);
        final Button dis=(Button)findViewById(R.id.display);
        final helper h=new helper(getApplicationContext());
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                h.insert(name.getText().toString(),id.getText().toString());
            }
        });
        dis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Display.class);
                startActivity(intent);
            }
        });
    }

}
