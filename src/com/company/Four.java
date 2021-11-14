package com.company;

import java.util.ArrayList;

public class Four {
    public static void main(String[] args) {
        int[] A = {1,-3,5-2,6,-5};
        ArrayList<Integer> list = new ArrayList<>();
        for (int el : A) {
            if(el < 0){
                list.add(el / 2);
            }
        }

        System.out.println(list);
    }
}
