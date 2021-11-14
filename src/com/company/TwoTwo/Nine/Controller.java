package com.company.TwoTwo.Nine;

import java.util.ArrayList;

public class Controller {
    private ArrayList<TelephoneSubscriber> list = new ArrayList<>();

    public void Add(TelephoneSubscriber telephoneSubscriber){
        list.add(telephoneSubscriber);
    }

    public void Show(){
        for (TelephoneSubscriber subscriber : list){
            System.out.println(subscriber.toString());
        }
    }
}
