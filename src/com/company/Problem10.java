package com.company;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextInt();
        long A = scanner.nextInt();
        long B = scanner.nextInt();
        long C = scanner.nextInt();
        if ((A + B + C) >= N) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
