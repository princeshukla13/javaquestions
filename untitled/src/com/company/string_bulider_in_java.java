package com.company;

public class string_bulider_in_java {
    public static void main(String[] args) {
        StringBuilder s =new StringBuilder("prince");
//        //change char to second  char //
//      s.setCharAt(0, 'b');
//      //if you want to insert any element in string//
//      s.insert(1,"e");
//      //if u want to delete any element//
//      s.delete(2,3);
//        System.out.println(s);
        for (int i=0;i<s.length()/2;i++){
            int front =i;
            int back =s.length()-1-i;
            char frontend=s.charAt(front);
            char backend =s.charAt(back);
            s.setCharAt(front,backend);
            s.setCharAt(back,frontend);
        }
        System.out.println(s);
    }
}
