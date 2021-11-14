package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Five {
    public static void main(String[] args) {
        int[] Array = {5,0,5,3,2,65,1,0,5};
        ArrayList<Integer> zeros = new ArrayList<>();
        for (int i = 0; i < Array.length; i++){
            if(Array[i] == 0){
                zeros.add(i);
            }
        }

        for (int i = zeros.get(0) + 1; i < zeros.get(1); i++){
            for (int i1 = zeros.get(0) + 1; i1 < zeros.get(1) - i ; i1++){
                if(Array[i1] < Array[i1 + 1]){
                    int tmp = Array[i1];
                    Array[i1] = Array[i1 + 1];
                    Array[i1 + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(Array));
    }
}
