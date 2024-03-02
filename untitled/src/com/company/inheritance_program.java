package com.company;

import org.w3c.dom.ls.LSOutput;

class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void printME(){
        System.out.println("i am contructor");
    }
}
class  derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class inheritance_program {
    public static void main(String[] args) {
base b=new base();
b.printME();


b.setX(3);
        System.out.println(b.getX());
    }
}






















