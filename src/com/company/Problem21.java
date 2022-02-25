package com.company;

import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println((int) (Math.ceil(a / 2.0) + Math.ceil(b / 2.0) + Math.ceil(c / 2.0)));
    }
}