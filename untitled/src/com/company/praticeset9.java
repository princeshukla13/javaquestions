package com.company;
class cylinder{
    private int radios;
    private int height;

    public cylinder(int radios, int height) {
        this.radios = radios;                  //problem3//
        this.height = height;
    }

    public int getRadios(){
    return radios;
}
    public int getHeight(){
        return height;
    }
    public void setRadios(int radios){
      this.radios=radios;
        }
    public void setHeight(int height){
        this.height=height;
    }
    public double surfacearea(){
        return 2*Math.PI*radios*radios*height;    //problem 2//
    }
}



public class praticeset9 {
    public static void main(String[] args) {
        cylinder hp=new cylinder(4,5);
   //    hp.setHeight(3);
//        hp.setRadios(4);
        System.out.println(hp.getHeight());
      System.out.println(hp.getRadios());
        System.out.println(hp.surfacearea());

    }
}
