package com.company.TwoTwo;

import java.util.ArrayList;
import java.util.Arrays;

public class Five {
    public static void main(String[] args) {
        int[] Array = {5,-1,5,3,2,65,1,0,5};
        int minid = 0;
        for (int i = 0; i < Array.length; i++){
            if(Array[i] < Array[minid]){
                minid = i;
            }
        }


        for (int i = minid + 1; i < Array.length; i++){
            for (int i1 = minid + 1; i1 < Array.length - 1; i1++){
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
