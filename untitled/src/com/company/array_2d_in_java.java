package com.company;

import javax.swing.*;
import java.util.Scanner;

public class array_2d_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row");
        int row = sc.nextInt();
        System.out.println("enter col");
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];
//        for input
//   for rows //
        System.out.println("add the element in matrix");
        for (int i = 0; i < row; i++) {
//       for col//
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
  //output
        System.out.println("the matrix is ");
        //   for rows //
        for (int i=0;i<row;i++) {
//       for col//
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();


        }}}