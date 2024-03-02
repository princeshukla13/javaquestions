package com.company;

import java.util.Scanner;

public class practicearry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  size of array elemt");
        int a=sc.nextInt();
        int name[]=new int[a];
        for (int i =0;i< name.length;i++){
            name[i]=sc.nextInt();
        }
//        System.out.println("element in array");
//        for (int i=0;i< name.length;i++){
//            System.out.println(name[i]);

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int i=0; i<name.length; i++) {
                if(name[i] < min) {
                    min = name[i];
                }
                if(name[i] > max) {
                    max = name[i];
                }
            }

            System.out.println("Largest number is : " + max);
            System.out.println("Smallest number is : " + min);

        }
    }

