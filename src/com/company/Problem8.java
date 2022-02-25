package com.company;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();
        long e = scanner.nextLong();

        if (a > b && b > c && c > d && d > e) {
            System.out.println((a + b + c + d) + " " + (b + c + d + e));
        } if (b > a && a > c && c > d && d > e) {
            System.out.println((a + b + c + d) + " " + (b + c + d + e));
        }
    }
}
// DAVOMI BOR...