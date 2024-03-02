package com.company;

import java.util.Scanner;

public class exceptions_in_java {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a");
      int a=  sc.nextInt();
        System.out.println("enter the b");
       int b= sc.nextInt();
       try {
           int c=a/b;
           System.out.println(c);

       }
       catch (Exception e){
           System.out.println(e);

       }


    }
}
