package com.enbiya.demir.sqliteexample;

public class Person {
    private int ID;
    private String name;
    private String adress;

    public Person(){}

    public Person(String name,String adress){
        name=name;
        adress=adress;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
