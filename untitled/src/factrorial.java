import java.util.Scanner;

public class factrorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value you want to fact");
        int a = sc.nextInt();
        int f = 1;
        int i = 1;
//        while (i<=a){
//            f *=i;
//            i++;
//        }
        if(a<0){
            System.out.println("invalid no");
            return;
        }
        for (i = 1; i<= a; i++) {
            f = f*i;
        }
        System.out.println(f);
    }
}