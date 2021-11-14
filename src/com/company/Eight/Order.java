package com.company.Eight;

public class Order {
    private int Id;
    private String Name;
    private String Courier;
    private String DateTime;
    private Type type;
    enum Type{
        Standart,
        Fast
    }

    @Override
    public String toString() {
        return "Order{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Courier='" + Courier + '\'' +
                ", DateTime='" + DateTime + '\'' +
                ", type=" + type +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCourier() {
        return Courier;
    }

    public void setCourier(String courier) {
        Courier = courier;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Order(int id, String name, String courier, String dateTime, Type type) {
        Id = id;
        Name = name;
        Courier = courier;
        DateTime = dateTime;
        this.type = type;
    }
}
