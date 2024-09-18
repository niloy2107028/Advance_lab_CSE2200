package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int a = sc.nextInt();

        int[] arr = new int[a];

        System.out.print("Enter value for array: ");

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value for searching : ");
        int s = sc.nextInt();
        int count = 0;
        for (int i = 0; i < a; i++) {
            if (arr[i] == s) {
                count++;
            }
        }

        System.out.println("Occurrence : " + count);


    }
}
