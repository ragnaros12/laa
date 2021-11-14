package com.company.Nine;

public class ExpressOrder extends Order{
    private String Courier;
    private int DaysToDeliver;

    public ExpressOrder(String date, String time, int id, String courier, int daysToDeliver) {
        super(date, time, id);
        Courier = courier;
        DaysToDeliver = daysToDeliver;
    }

    @Override
    public String toString() {
        return "ExpressOrder{" +
                "Courier='" + Courier + '\'' +
                ", DaysToDeliver=" + DaysToDeliver +
                '}';
    }
}
