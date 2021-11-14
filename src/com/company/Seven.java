package com.company;

import java.util.Arrays;
import java.util.Random;

public class Seven {
    public static void main(String[] args) {
        int[][] Array = new int[5][5];
        Random rnd = new Random();
        for (int i = 0; i < Array.length; i++){
            for (int i1 = 0; i1 < Array[i].length; i1++){
                Array[i][i1] = rnd.nextInt(10);
            }
            System.out.println(Arrays.toString(Array[i]));
        }

        int countZero = 0;
        for (int i = 0; i < Array.length / 2; i++){
            for (int i1 = i; i1 < Array[i].length - i; i1++){
                if(Array[i][i1] == 0)
                    countZero++;
            }
        }
        System.out.println(countZero);
    }
}
