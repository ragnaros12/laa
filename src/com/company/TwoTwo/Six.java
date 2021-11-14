package com.company.TwoTwo;

import java.util.Arrays;
import java.util.Random;
import java.util.Vector;

public class Six {
    public static void main(String[] args) {
        int[][] Matrix = new int[3][3];
        Random random = new Random();
        Vector<Integer> vector = new Vector<>();

        for (int i = 0; i < Matrix.length; i++){
            for (int i1 = 0; i1 < Matrix[i].length; i1++){
                Matrix[i][i1] = -5 + random.nextInt(10);
            }
            System.out.println(Arrays.toString(Matrix[i]));
        }
        for (int i = 0; i < Matrix.length; i++){
            int max = Matrix[i][0];
            for (int i1 = 0; i1 < Matrix[i].length; i1++){
                if(max < Matrix[i][i1]){
                    max = Matrix[i][i1];
                }
            }
            vector.add(max);
        }
        for (int i = 0; i < Matrix.length; i++){
            for (int i1 = 0; i1 < Matrix[i].length; i1++){
                Matrix[i][i1] += vector.get(i);
            }
            System.out.println(Arrays.toString(Matrix[i]));
        }

    }
}
