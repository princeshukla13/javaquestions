import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your  amount:");
        int cost = sc.nextInt();
        System.out.println("enter unit of product:");
        int unit = sc.nextInt();
//        System.out.println("enter discount:");
//        int discount = sc.nextInt();
         int discount=0,amount=0;
        int total = (cost * unit);
        if (total >= 1000) {
            discount = total * 10 / 100;
             amount = total - discount;
        }
        System.out.println("total amount : " + total);
        System.out.println("total Discount : " + discount);
        System.out.println("total Original Bill : " + amount );
    }
}
