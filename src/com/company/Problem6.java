package com.company;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 4 == 0 && (n % 100 != 0 || n % 400 == 0)) {
            System.out.printf("12/09/%04d", n);
        } else {
            System.out.printf("13/09/%04d", n);
        }
    }
}
