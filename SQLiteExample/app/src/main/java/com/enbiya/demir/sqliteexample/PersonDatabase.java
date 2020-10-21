package com.enbiya.demir.sqliteexample;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class PersonDatabase extends SQLiteOpenHelper {

    private static final String dbname="personDB";
    private static final String personTBL="personTBL";
    private static final int dbversion=1;



    public PersonDatabase(Context context) {   //sadece context bırak gerisini super içine yaz
        super(context, dbname, null, dbversion); //super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
           String persontblCreate="CREATE TABLE " + personTBL + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, adress INT) ";
           db.execSQL(persontblCreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
      db.execSQL("DROP TABLE IF EXISTS " + personTBL);
      onCreate(db);
    }

    public long savePerson(Person person){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("person_name",person.getName());
        cv.put("person_adress",person.getAdress());

        long id= db.insert(personTBL,null,cv);
        return id;
    }

    public List<Person> getirPersonList(){
        List<Person> personList=new ArrayList<Person>();
        SQLiteDatabase db=this.getReadableDatabase();
        String sqlsorgusu= "Select * from " + personTBL;

        Cursor cursor=db.rawQuery(sqlsorgusu,null);
        int siraNoID= cursor.getColumnIndex("ID");
        int siraNoName= cursor.getColumnIndex("person_name");
        int siraNoAdress= cursor.getColumnIndex("person_adress");

        try{while(cursor.moveToNext()){
            Person _person=new Person();
            _person.setName(cursor.getString(siraNoName));
            _person.setAdress(cursor.getString(siraNoAdress));
            personList.add(_person);



        }


        }
        finally {
            cursor.close();
            db.close();
        }


        return personList;

    }
}
