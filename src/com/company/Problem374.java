package com.company;

import java.util.Scanner;

public class Problem374 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c));
    }
}
