package com.company;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = -2;
        double y, f;
        if(x <= 0){
            y = a - Math.pow(b, x + 1);
            f = Math.pow(Math.E, Math.tan(a * x + 1));
        }
        else if(x > 0 && x <= 3){
            y = 1 + Math.pow(3, x * a);
            f = Math.pow(x, a) - Math.pow(Math.sin(x), b);
        }
        else{
            y = Math.atan(a * x + 1);
            f = Math.pow(Math.pow(x,2), 0.2f);
        }
        System.out.println("y = " + y);
        System.out.println("f = " + f);
    }
}
