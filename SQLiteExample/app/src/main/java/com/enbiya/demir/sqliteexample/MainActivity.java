package com.enbiya.demir.sqliteexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.io.StringBufferInputStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ListView listvw;
    Button btnSave,btnList;
    EditText editID,editAdress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listvw=(ListView)findViewById(R.id.listvw);
        btnList=(Button)findViewById(R.id.btnList);
        btnSave=(Button)findViewById(R.id.btnSave);
        editAdress=(EditText)findViewById(R.id.editAdress);
        editID=(EditText) findViewById(R.id.editID);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name=editID.getText().toString();
                String adress=editAdress.getText().toString();

                if(name.isEmpty() || adress.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Adress or ID is empty.",Toast.LENGTH_LONG).show();
                    return;
                }

                Person person=new Person(name,adress);

                PersonDatabase db=new PersonDatabase(getApplicationContext());
                long id=db.savePerson(person);

                editAdress.setText("");
                editID.setText("");

            }
        });

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Listele.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View view) {

    }
}