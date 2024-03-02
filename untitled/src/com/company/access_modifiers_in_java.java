package com.company;
class prince{

    private int id;
    private  String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
    id=i;
    }

    public int getId() {
        return id;
    }
}
public class access_modifiers_in_java {
    public static void main(String[] args) {
        prince pr=new prince();
        pr.setId(34);
        pr.setName("shukla");
        System.out.println("name "  +pr.getName());
        System.out.println("id "  +  pr.getId());

    }
}
