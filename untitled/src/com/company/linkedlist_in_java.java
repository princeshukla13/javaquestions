package com.company;

import java.util.LinkedList;

public class linkedlist_in_java {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.addFirst("figo");
        cars.offerFirst("inova");

       for(int i=0;i<= cars.size();i++)
            System.out.println(cars);
        }

    }






