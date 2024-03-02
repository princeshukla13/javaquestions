package com.company;

public class recurison__class_1{
    public static void printno(int n ,int m){
        // if (n==0){
        //     return;
        // }

        System.out.println(n +m);
        printno(n+m);
    }



    public static void main(String[] args) {
        int n =5;
        int m =4;
        printno(n+m);
//        question 1

    }
}

