package com.company;

public class praticeofmethods {
    static void multi(int a){
        for(int i=0;i<=10;i++){
            System.out.format("%d X %d= %d\n",a,i,a*i);  //problem1//
        }
    }
    static void pattern(int n ){
        for (int i=0;i<n;i++){
            for ( int j=0;j< i+1;j++){
                System.out.print("*");    //problem 2// 
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//multi(19);
pattern(9);


    }

}
