package com.Two_Sum;

import java.util.Scanner;
import java.io.*;

public class Two_Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr_num = 0;
        int arr[] = new int[arr_num];
        int target = 0;
        System.out.println("Enter the number of elements");
        arr_num = sc.nextInt();
        System.out.println("enter elements");
        for (int i = 0; i < arr_num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target number");
        target = sc.nextInt();
        for (int i = 0; i < arr_num; i++) {
            for (int j = 0; j < arr_num; j++) {
                if (arr[i] + arr[j] == target)
                    System.out.println(arr[i] + " " + arr[j]);

            }
        }
    }
}