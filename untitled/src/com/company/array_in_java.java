package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class array_in_java {
    public static void main(String[] args) {
//        type 1 to define array
//        int[] marks = new int[3];
//        marks[0] = 72;
//        marks[1] = 7;
//        marks[2] = 57;
        Scanner sc = new Scanner(System.in);


        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int no[] = new int[size];
        System.out.println("storing input in array");
        for (int i = 0; i < size; i++) {
            no[i] = sc.nextInt();
        }

//
//            System.out.println("enter the no you want to find in array");
//            int x = sc.nextInt();
//
//            for (int i = 0; i < no.length; i++)
//            if (no[i] == x) {
//                System.out.println("x found at location "  +   ", " );
//
//       }

        System.out.println("element in array");
        for (int i = 0; i < size; i++) {
            System.out.print (" " +no[i]);
        }
            }
        }

