package com.company;
class A{
    public void c(){
        System.out.println("me a class ka hu");
    }
    public void c2(){
        System.out.println("me c2 a class ka hu");
    }
}
class B extends A{
    @Override
    public void c(){
        System.out.println("me b class ka hu");
    }
}
public class method_overriding {
    public static void main(String[] args) {
//        A e=new A();
//        e.c();
       B q=new B();
      q.c();

    }
}
