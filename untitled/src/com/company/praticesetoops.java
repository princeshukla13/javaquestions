package com.company;

import java.util.Scanner;

class  employee{
    int salary;
    String name;           //problem 1//

    public int getSalary() {
        return salary;
    }

    public String getName() {         //methods//
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class cellphone{            //problem2//
    public void ring(){
        System.out.println("ringing");
    }
public void vib(){
    System.out.println("vibreting");
}
}
   class squre{
    int side;
    public  int area() {
     return side*side;
    }
    public int perimeter(){

        return 4*side;
    }

   }
   class rectangle{
    int length;
    int width;
    public int area(){
        return length*width;
    }



   }

public class praticesetoops {
    public static void main(String[] args) {
/*employee name =new employee();                   //object

name.setName( "anas");
        System.out.println(name.getName( ));
name.salary=10000;
        System.out.println(name.getSalary());


        cellphone sony= new cellphone();
        sony.ring();
        sony.vib();*/

        squre sq =new squre();
        sq.side=3;
        System.out.println( sq.area());
        System.out.println(sq.perimeter());
        rectangle rc=new rectangle();
        rc.length=3;
        rc.width=4;
        System.out.println(rc.area());
    }
}
  