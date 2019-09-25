package com.soi.notemanagementsystem;

public class category {
    category() {
    }

    ;

    category(String a, String b) {
        this.name = a;
        this.date = b;
    }

    public String name;
    public String date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return name + '\n' + date
                ;
    }
}

