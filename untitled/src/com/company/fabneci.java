package com.company;

public class fabneci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c ;
        int count=6;
        System.out.println(a);
        System.out.println(b);
        for (int i=2;i<count;++i){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;


        }
    }
}
