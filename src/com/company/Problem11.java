package com.company;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int max = 0;
        int maxSec = 0;
        for (int i = 0; i < count; i++) {
            int temp = scanner.nextInt();
            if (temp > max) {
                maxSec = max;
                max = temp;
            } else if (temp > maxSec) {
                maxSec = temp;
            }
        }
        System.out.println(maxSec);
    }
}
