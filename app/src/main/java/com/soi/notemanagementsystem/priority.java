package com.soi.notemanagementsystem;

public class priority {
    priority (){}
    priority (String a,String b){
        this.prio = a;
        this.date = b;
    }
    public String prio;
    public String date;

    public String getName() {
        return prio;
    }

    public void setName(String name) {
        this.prio = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return prio + '\n' + date
                ;
    }
}
