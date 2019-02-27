package com.example.conn;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class helper extends SQLiteOpenHelper {
public  static int ver =1;
public  static String nam="b";
public  static String table="st";
public  static String idf="id";
public  static String namef="name";
public  ArrayList<sssss> lol;
public  ArrayList<na> naaaaa;
public  Context context;
    public helper(Context context) {
        super(context, nam, null, ver);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+table+"("+idf+" INTEGER,"+namef+" TEXT)");

    }
public void insert(String name,String id)
{
    SQLiteDatabase db=this.getWritableDatabase();
    ContentValues cv = new ContentValues();
    cv.put(idf,id);
    cv.put(namef,name);
    db.insert(table,null,cv);
}
public void update(String name,String id)
{
    SQLiteDatabase db=this.getWritableDatabase();
    ContentValues cv = new ContentValues();
    cv.put(namef,name);
    db.update(table,cv,idf+"="+id,null);
}
public ArrayAdapter display()
{
    SQLiteDatabase db= this.getWritableDatabase();
    Cursor c=db.rawQuery("select * from "+table,null);
    lol = new ArrayList<>();
    naaaaa = new ArrayList<>();
   if(c.moveToFirst())
   {
       while (c.moveToNext())
       {
           String mid = c.getString(0);
           sssss ss=new sssss();
           ss.setId(mid);
           lol.add(ss);
           String lolnam = c.getString(1);
           na n=new na();
           n.setName(lolnam);
           naaaaa.add(n);
       }
   }
   cus ad=new cus(context.getApplicationContext(),naaaaa,lol);
   return ad;

}
public  void  delete(String id)
{
    SQLiteDatabase db=this.getWritableDatabase();
    db.delete(table,idf+"="+id,null);
}
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
