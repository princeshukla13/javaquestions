package com.company;

public class string_placement {
    public static void main(String[] args) {
        String name ="prince";
        String surname="shukla";
        System.out.println("your name is"   +name +" " +surname);
        System.out.println(name.length());
        for (int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));}
            if (name.compareTo(surname)==0){
                System.out.println("strings are equle");
            }
            else{
                System.out.println("not equle");
            }
String sen="my name is prince";
        System.out.println(sen.substring(11));
        }

    }

