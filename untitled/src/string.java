import java.util.Scanner;
public class string {

    public static void main(String[] args) {
//        String s = "prince";
//        System.out.println(s);
       Scanner sc=new Scanner( System.in);
        System.out.println("enter the string");
       String c = sc.nextLine();
//        System.out.println();
        System.out.println(c.toUpperCase()); //to uppercase//
        System.out.println(c.substring(4));
        System.out.println(c.startsWith("q"));
        System.out.println(c.replace("r","e"));
    }
}