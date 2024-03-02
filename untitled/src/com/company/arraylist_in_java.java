package com.company;

import java.util.ArrayList;

public class arraylist_in_java {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(2);
        myNumbers.add(21);
        myNumbers.add(25);
        myNumbers.add(26);
        myNumbers.add(27);
        myNumbers.remove(3);

//        myNumbers.clear();
        for (Integer i:myNumbers
             ) {
            System.out.println(i);
        }





    }
}
