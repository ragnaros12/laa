package com.company.TwoTwo.Nine;

public class International extends TelephoneSubscriber{
    private String City;
    private String Country;
    private int Minutes;
    private int Price;
    private int SummPrice;
    private int Month;
    private int Year;

    public International(String name, String secondName, String patronymic, String address, String city, String pasport, String city1, String country, int minutes, int price, int summPrice, int month, int year) {
        super(name, secondName, patronymic, address, city, pasport);
        City = city1;
        Country = country;
        Minutes = minutes;
        Price = price;
        SummPrice = summPrice;
        Month = month;
        Year = year;
    }

    @Override
    public String toString() {
        return "International{" +
                "City='" + City + '\'' +
                ", Country='" + Country + '\'' +
                ", Minutes=" + Minutes +
                ", Price=" + Price +
                ", SummPrice=" + SummPrice +
                ", Month=" + Month +
                ", Year=" + Year +
                '}';
    }
}
