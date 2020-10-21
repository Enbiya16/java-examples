package com.enbiya.demir.sqlitetaslak;

public class Book {
    int id;
    String name;
    String author;
 //genereta for all getter setter and generate except id for all consrtuctor
    public Book(String name,String author) {
        this.name = name;
        this.author=author;
    }

    public Book(){}
    //üst taraf constructor alt taraf getter setter

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
