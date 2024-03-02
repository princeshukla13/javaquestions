package com.company;
class goodmorning extends Thread{
      public void run(){
          System.out.println("gm");
      }
}
class welcome extends Thread{
    public void run(){
        System.out.println("welcome");
    }
}
public class practice_set_13 {
    public static void main(String[] args) {
        goodmorning g=new goodmorning();
        g.start();


    }
}
