import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc =new Scanner( System.in);
        System.out.println("enter the value");
        int a= sc.nextInt();
        for(int i=10;i>=1;i--){
            int b = a * i ;
        System.out.printf("%d X %d = %d \n" ,a,i,b);
        }
    }
}
