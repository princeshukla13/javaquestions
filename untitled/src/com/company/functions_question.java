package com.company;

import java.util.Scanner;

public class functions_question {
    public static void graterno(int a,int b,int c){
        if ((a>b) && (a>c)){
            System.out.println("a is big");
        }
        else if ((b>a) &&(b>c)){
            System.out.println("b is big");
        }
        else{
            System.out.println("c is big");
        }

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        graterno(a,b,c);

    }
}
