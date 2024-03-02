package com.company;

abstract class Animal {
    public abstract void animalSound();{

    }  public abstract void animaleat();

    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pig extends Animal {
    @Override
    public void animalSound() {

        System.out.println("The pig says: wee wee");
    }
    public  void animaleat(){
        System.out.println("can eat");
    };
}

class abstract_class_in_java{
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
        myPig.animaleat();
    }
}
