package com.company;

import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(Math.min(a,b) / 10);
        System.out.println(Math.pow(Math.max(a,b), 2));
    }
}
