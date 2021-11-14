package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Vector;

public class Six {
    public static void main(String[] args) {
        int[][] Array = new int[4][4];
        Vector<Double> vector = new Vector<>();
        Random random = new Random();
        for (int i = 0; i < Array.length; i++){
            for (int i1 = 0; i1 < Array[i].length; i1++){
                Array[i][i1] = -5 + random.nextInt(10);
            }
            System.out.println(Arrays.toString(Array[i]));
        }

        for (int i = 0; i < Array.length; i++){
            double math = 0;
            for (int i1 = 0; i1 < Array[i].length; i1++){
                math += Array[i][i1];
            }
            vector.add(math / Array[i].length);
        }

        System.out.println(vector);
    }
}
