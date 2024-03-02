package com.company;

import java.util.Scanner;

public class basic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
//        System.out.println("enter b");
//        int b = sc.nextInt();
//        if (a > b) {
//            System.out.println("the max no is" + a);
//        } else {
//            System.out.println("b is max" + b);
//        }
   // }
//int s=0;
//        for (int i=2;i<=a;i++){
//            if (i%2!=0){
//                 s= s+i;
//                System.out.println(s);
//            }
//
//
//
//        }
        int f=1;
        for (int i=1;i<=a;i++){
            f=f*i;


        }
        System.out.println(f);
    }
}
