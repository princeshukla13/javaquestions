package com.company;

class mythread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<10){
            System.out.println("hey");
            i++;
                    }

    }
 class Mythread2   extends Thread{
@Override
        public void run(){
            int i=0;
            while (i<10){
                System.out.println("byy");
                i++;
            }

        }
    }
}
public class multithreading_in_java {
    public static void main(String[] args) {
        mythread1 m1=new mythread1();
        





    }
}


