package com.company;

import java.util.Scanner;

public class Problem119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 4 == 0) {
            System.out.println(n / 2);
        } else
            System.out.println(-1);
    }
}
