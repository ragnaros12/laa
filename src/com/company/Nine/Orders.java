package com.company.Nine;

import java.util.ArrayList;

public class Orders {
    private ArrayList<Order> orders = new ArrayList<>();

    public void Add(Order order){
        orders.add(order);
    }

    public void Show(){
        for (Order order : orders){
            System.out.println(order.toString());
        }
    }
}
