package com.example.conn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

class cus extends ArrayAdapter<sssss> {
    ArrayList<na>name;
    ArrayList<sssss>id;
    Context context;

    public cus(Context context,ArrayList name,ArrayList id) {
        super(context,R.layout.custom,name);
        this.name=name;
        this.id=id;
        this.context=context;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.custom,parent,false);
        TextView idd = (TextView)v.findViewById(R.id.iid);
        TextView nam = (TextView)v.findViewById(R.id.namm);
        Button del = (Button)v.findViewById(R.id.dell);
        final sssss s=new sssss();
        idd.setText(id.get(position).getId());
        nam.setText(name.get(position).getName());
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper h=new helper(getContext());
                h.delete(id.get(position).getId());
            }
        });
        return v;
    }
}
