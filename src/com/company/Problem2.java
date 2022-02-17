package com.company;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A > B) {
            System.out.println(">");
        } if (A < B) {
            System.out.println("<");
        } if (A == B) {
            System.out.println("=");
        }
    }
}
