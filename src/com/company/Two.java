package com.company;

import java.util.Scanner;

public class Two {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        double d = (Math.pow(max,5) - 3.2f * min) / (1 + min);
        System.out.println(d);
    }
}
