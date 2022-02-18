package com.company;

import java.util.Scanner;

public class Problem138 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println((n * n) * ((n * n * n) + (8 * n * n) - (5 * n) + 3) + n - 12);
    }
}
