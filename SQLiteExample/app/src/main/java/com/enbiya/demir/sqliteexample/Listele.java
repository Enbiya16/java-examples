package com.enbiya.demir.sqliteexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class Listele extends AppCompatActivity {

    EditText editMulti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listele);

        editMulti=(EditText)findViewById(R.id.editMulti);
        PersonDatabase db=new PersonDatabase(getApplicationContext());

        List<Person> personList=new ArrayList<Person>();
        personList =db.getirPersonList();

        StringBuilder sb=new StringBuilder();



        for(Person _person:personList){
            String icerik = "ID" + _person.getID() + "Name" + _person.getName() + "Adress" + _person.getAdress() + "\n\n";
            sb.append(icerik);

        }

        editMulti.setText(sb);
    }
}