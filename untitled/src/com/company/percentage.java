package com.company;

import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 marks : ");
        int a = sc.nextInt();
        System.out.println("enter 2 marks : ");
        int b = sc.nextInt();
        System.out.println("enter 3 marks : ");
        int c = sc.nextInt();

        int total = a+b+c;
        float avg = total*100/300;
        System.out.println("my per is : "+ avg);
    }
}
