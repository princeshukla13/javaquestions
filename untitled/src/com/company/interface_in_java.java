package com.company;
interface Animal1 {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}
interface animal3 extends Animal1{
    void run();
}

// Pig "implements" the Animal interface
class Pig1 implements animal3 {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
    public void run(){
        System.out.println("can run");
    }
}

public class interface_in_java {
    public static void main(String[] args) {
        Pig1 mypig1=new Pig1();
        mypig1.animalSound();
        mypig1.run();
        mypig1.sleep();
//        animal3 a=new Pig1();

    }
}


