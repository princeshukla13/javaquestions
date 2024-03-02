package com.company;
abstract class pen{
   abstract void write();
   abstract void refill();
}
class cello extends pen{
    void write(){
        System.out.println("can write");
    }
    void refill(){
        System.out.println("can refill");
    }
    void changerefill(){
        System.out.println("change");

    }


}

class  monkey{
    void vite(){
        System.out.println("can vite");
    }
    void jump(){
        System.out.println("jump");
    }
}
interface basicanimal{
    void eat();
    void sleep();
}
class human extends monkey implements basicanimal{
    void speak(){
        System.out.println("speak");
    }
    @Override
   public void eat(){
        System.out.println("eat");
    }
    @Override
  public   void sleep(){
        System.out.println("sleep");
    }
}
interface tvremote{
    void ontv();

}
interface smartremort extends tvremote{
     void offtv();
}
class tv implements tvremote ,smartremort{
    public void ontv(){
        System.out.println("on the tv");
    }
    public  void offtv(){
        System.out.println("off the tv");
    }
}
public class practice_set_11_java {
    public static void main(String[] args) {
        //Q1+Q2//
       cello c=new cello();
      c.write();
      c.refill();
       c.changerefill();
       //Q3//
        human m=new human();
        m.eat();
        m.sleep();m.speak();m.jump();m.vite();
        //Q5
        monkey m1=new human();
        m1.vite();
        m1.jump();
        basicanimal b1=new human();
        b1.eat();
        b1.sleep();
        // Q6+7//
        tv onida =new tv();
        onida. offtv();
        onida.ontv();




    }
}
