import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc =new Scanner( System.in);
       System.out.println("enter value a: ");
        int a = sc.nextInt();
        System.out.println("enter value b: ");
        int b = sc.nextInt();
        System.out.println("enter value c: ");
        int c = sc.nextInt();
        int sum=a+b;
       System.out.println("sum " + sum);
    }
}