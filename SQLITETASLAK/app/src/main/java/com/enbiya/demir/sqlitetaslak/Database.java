package com.enbiya.demir.sqlitetaslak;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Database extends SQLiteOpenHelper {

    public static final String database_NAME="BookDB";
    public static final int database_VERSION=1;

    public static final String book_ID="id";
    public static final String book_NAME="name";
    public static final String book_AUTHOR="author";

    public static final String table_NAME="BookTable";

    public static final String CREATE_BOOK_TABLE="CREATE TABLE " + table_NAME + " (" +
            book_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            book_NAME + " TEXT, " +
            book_AUTHOR + " TEXT " +
            ")";


    public Database(@Nullable Context context) {
        super(context, database_NAME, null, database_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_BOOK_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       db.execSQL("DROP TABLE IF EXISTS "+table_NAME);
       this.onCreate(db);
    }

    public void Add(Book book){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues value=new ContentValues();
        value.put(book_NAME,book.name);
        value.put(book_AUTHOR,book.author);
        db.insert(table_NAME,null,value);
        db.close();
    }

    public List<Book> listBooks(){
        List<Book> booklist =new ArrayList<>();
        String query = "Select * FROM "+table_NAME;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor= db.rawQuery(query,null);
        Book book=null;
        if(cursor.moveToFirst()){do{
         book=new Book();
         book.setId(Integer.parseInt(cursor.getString(0)));
         book.setName(cursor.getString(1));
         book.setAuthor(cursor.getString(2));
         booklist.add(book);
        }while (cursor.moveToNext());

        }
        return booklist;
    }


}
