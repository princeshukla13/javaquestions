import java.util.Scanner;

public class assosicative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a");
        int a= sc.nextInt();
        System.out.println(" enter b");
        int b= sc.nextInt();
        System.out.println(" enter c");
        int c= sc.nextInt();
        int k;
        k = b*b-(4*a*c)/(2*a);
        System.out.println(k);
    }
}
