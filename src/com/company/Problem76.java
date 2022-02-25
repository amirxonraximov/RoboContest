package com.company;

import java.util.Scanner;

public class Problem76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int a4 = scanner.nextInt();
        int a5 = scanner.nextInt();
        int a6 = scanner.nextInt();
        int a7 = scanner.nextInt();
        int S = scanner.nextInt();

        if ((a1 + a2 + a3 + a4 + a5 + a6 + a7) <= S) {
            System.out.println(S - (a1 + a2 + a3 + a4 + a5 + a6 + a7));
        } else {
            System.out.println(0);
        }
    }
}
