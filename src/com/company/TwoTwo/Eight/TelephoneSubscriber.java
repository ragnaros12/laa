package com.company.TwoTwo.Eight;

public class TelephoneSubscriber {
    private String FIO;
    private String Address;
    private String Phone;
    private int Month;
    private int year;
    private int CountMinutes;
    private double Cost;

    @Override
    public String toString() {
        return "TelephoneSubscriber{" +
                "FIO='" + FIO + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Month=" + Month +
                ", year=" + year +
                ", CountMinutes=" + CountMinutes +
                ", Cost=" + Cost +
                '}';
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCountMinutes() {
        return CountMinutes;
    }

    public void setCountMinutes(int countMinutes) {
        CountMinutes = countMinutes;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        Cost = cost;
    }

    public TelephoneSubscriber(String FIO, String address, String phone, int month, int year) {
        this.FIO = FIO;
        Address = address;
        Phone = phone;
        Month = month;
        this.year = year;
    }
}
