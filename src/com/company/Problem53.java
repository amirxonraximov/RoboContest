package com.company;

import java.util.Scanner;

public class Problem53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        if (N > 3) {
            System.out.println((N * (N - 3)) / 2);
        } else
            System.out.println(0);
    }
}
