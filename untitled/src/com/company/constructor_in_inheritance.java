package com.company;
class base1{
    base1(){
        System.out.println("i am constructor");
    }
    base1(int x){
        System.out.println("i am overload constructor with the value of x"+x);
    }
}
class derived1 extends base1{

    derived1(){
//      super(3);
        System.out.println(" i am derived class constructor");
    }
    derived1(int x,int y){
        super(x);
        System.out.println(" i am derived overload constructor with the value of y"+y);
    }
/*   class  Derived2 extends derived1{
        Derived2(){
            System.out.println(" i am child constructor");
        }
        Derived2(int x,int y,int z){
            super(x, y);
            System.out.println(" i am  overloadchild constructor with the value of z"+z);
        }
    }*/
    }

public class constructor_in_inheritance {
    public static void main(String[] args) {
//base1 b=new base1();
derived1 d=new derived1(12,34);


    }
}
