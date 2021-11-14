package com.company.Nine;

public class Order {
    private String Date;
    private String Time;
    private int Id;

    public Order(String date, String time, int id) {
        Date = date;
        Time = time;
        Id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "Date='" + Date + '\'' +
                ", Time='" + Time + '\'' +
                ", Id=" + Id +
                '}';
    }
}
