package com.company;
class student {
    private int age;
    private String name;

    public student() {
        age = 45;
        name = "prince";
    }
  public student(String myname ,int myage){
age= myage;
        name= myname;

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}




    public class constructor {
        public static void main(String[] args) {
            student arun = new student();

            System.out.println(arun.getAge());
            System.out.println(arun.getName());

        }
    }

