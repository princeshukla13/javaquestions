package com.company;

public class patterns_question {
    public static void main(String[] args) {
//        int n=4;
//        int m=5;
//     for (int i=1;i<=n;i++){
//            for (int j=1;j<=m;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//        int n =4;
//        for (int i=1;i<=n;i++){
//            for( int j=1;j<=n-1;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int n =4;
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
          System.out.println();
//        }

        int n=6;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if (sum %2==0){
                    System.out.print("1");

                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }


    }



