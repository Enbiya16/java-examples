package com.enbiya.demir.sqliteexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Listele extends AppCompatActivity {

    TextView editMulti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listele);

        editMulti=(TextView)findViewById(R.id.editMulti);
        PersonDatabase db=new PersonDatabase(getApplicationContext());

        ArrayList<Person> personList=new ArrayList<Person>();
        personList = (ArrayList<Person>) db.getirPersonList();

        StringBuilder sb=new StringBuilder();



        for(Person _person:personList){
            String icerik = "ID" + _person.getID() + "Name" + _person.getName() + "Adress" + _person.getAdress() + "\n\n";
            sb.append(icerik);

        }

        editMulti.setText(sb);
    }
}