package com.company;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;

        System.out.println("please select operations *,/,+,-");
        char operater = sc.next().charAt(0);
        System.out.println("enter the first no");
        int a = sc.nextInt();
        System.out.println("enter the second no");
        int b = sc.nextInt();



        switch(operater){
        case '+':

            result = a + b;
            System.out.println(result);
            break;
        case '-':
            result = a - b;
            System.out.println(result);
            break;
        case '*':
            result = a * b;
            System.out.println(result);
            break;
        case '/':
            result = a / b;
            System.out.println(result);
            break;
        default:
            System.out.println("invalid ");

    }


    }
}

