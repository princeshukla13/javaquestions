package com.company;

public class oops {
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        oops mycar=new oops();
        mycar.speed(200);
        mycar.fullThrottle();
    }
}
