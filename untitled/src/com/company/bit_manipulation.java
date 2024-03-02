package com.company;

import java.util.Scanner;

public class bit_manipulation {
    public static void main(String[] args) {
//        for get //
//       int n =5;
//       int pos=4;
//       int bitmask =1<<pos;
////       if((bitmask&n)==0){
////           System.out.println("no is one");
////       }
////       else {
////           System.out.println("no is zero");
////       }
    //   set for//
//        int n =5;
//        int pos =1;
//        int bitmask =1<<pos;
//        int setno=bitmask|n;
//        System.out.println(setno);
//        clear for

//int n =5;
//int pos =2;
//int bitmask=1<<pos;
//int newbitmask= ~(bitmask);
//int clearvalue=newbitmask&n;
//        System.out.println(clearvalue);

//        update for
        Scanner sc =new Scanner(System.in);
        int operation =sc.nextInt();
        int n =5;
        int pos =0;
        int bitmask=1<<pos;
        if (operation==1){
            int setno=bitmask|n;
       System.out.println(setno);

        }else{
           int newbitmask= ~(bitmask);
int clearvalue=newbitmask&n;
       System.out.println(clearvalue);
        }


    }
}
