package com.company.TwoTwo.Nine;

public class Internet extends TelephoneSubscriber{
    private String NameConnect;
    private int GBytes;
    private int Price;
    private int Month;
    private int Year;

    public Internet(String name, String secondName, String patronymic, String address, String city, String pasport, String nameConnect, int GBytes, int price, int month, int year) {
        super(name, secondName, patronymic, address, city, pasport);
        NameConnect = nameConnect;
        this.GBytes = GBytes;
        Price = price;
        Month = month;
        Year = year;
    }

    @Override
    public String toString() {
        return "Internet{" +
                "NameConnect='" + NameConnect + '\'' +
                ", GBytes=" + GBytes +
                ", Price=" + Price +
                ", Month=" + Month +
                ", Year=" + Year +
                '}';
    }
}
