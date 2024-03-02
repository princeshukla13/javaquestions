package com.company;

import java.util.Scanner;

public class sorting_dsa_in_java {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the element want to sort");
        int n  =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("storing input in array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        bubble sort
       for (int i =0;i< n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j] > arr[j+1]) {
                    int swap       = arr[j];
                    arr[j]   = arr[j+1];
                    arr [j+1] = swap;

                }
            }
        }System.out.println("Sorted litst of numbers");
        for (int i = 0; i< n; i++)
            System.out.print(" "+arr[i]);


    }
}
