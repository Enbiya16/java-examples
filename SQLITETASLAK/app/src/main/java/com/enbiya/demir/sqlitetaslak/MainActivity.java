package com.enbiya.demir.sqlitetaslak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteAccessPermException;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Database db=new Database(getApplicationContext());
    List<Book> list;
    ArrayAdapter<String>mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db.onUpgrade(db.getWritableDatabase(),1,2);
        db.Add(new Book("calikusu","ahmet"));

        db.listBooks();
        List<String>listBooks=new ArrayList<>();

        for(int i=0; i<list.size();i++){
            listBooks.add(i,list.get(i).getName());
        }
        mAdapter=new ArrayAdapter<String>(context,R.layout.)
    }
}