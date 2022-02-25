package com.company;

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long K = scanner.nextLong();
        if (N == 0) {
            System.out.println(1);
        } else {
            System.out.println(K + 1);
        }
    }
}
