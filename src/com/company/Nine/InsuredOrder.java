package com.company.Nine;

public class InsuredOrder extends Order{
    private String Company;
    private double mount;

    public InsuredOrder(String date, String time, int id, String company, double mount) {
        super(date, time, id);
        Company = company;
        this.mount = mount;
    }

    @Override
    public String toString() {
        return "InsuredOrder{" +
                "Company='" + Company + '\'' +
                ", mount=" + mount +
                '}';
    }
}
