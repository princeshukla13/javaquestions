package com.company;
class myworker{
    private int id;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
public class gettersetter {
    public static void main(String[] args) {
        myworker prince=new myworker();
        prince.setId(4);
        System.out.println(prince.getId());
        prince.setName("shukla");
        System.out.println(prince.getName());
    }
}
