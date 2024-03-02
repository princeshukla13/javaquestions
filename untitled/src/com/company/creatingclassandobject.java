package com.company;
class employ {
    int a;
    String name;

    public void method() {
        System.out.println("my a is" + a); //methods//
    }
}
public class creatingclassandobject {
    public static void main(String[] args) {
employ ram=new employ();    //object creating//
ram.a= 34;
//ram.method();   method call
       System.out.println(ram.a);
    }
}
