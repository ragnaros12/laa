package com.company.TwoTwo.Nine;

public class Cyties extends TelephoneSubscriber{
    private int Tarif;
    private int CountMinutes;
    private int Payment;
    private int year;
    private int month;

    public Cyties(String name, String secondName, String patronymic, String address, String city, String pasport, int tarif, int countMinutes, int payment, int year, int month) {
        super(name, secondName, patronymic, address, city, pasport);
        Tarif = tarif;
        CountMinutes = countMinutes;
        Payment = payment;
        this.year = year;
        this.month = month;
    }
}
