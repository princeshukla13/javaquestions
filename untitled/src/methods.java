import java.util.Scanner;

public class methods{
  /*  static void age(int i) {
        if (i > 16) {
            System.out.println("yes");
       } else {
        System.out.println("no");
      }
  }*/
    static int add( int x, int y){
      int z= x+y;
        return z;
    }


    public static void main(String[] args) {
//        age(67);
      Scanner sc =new Scanner(System.in);
        System.out.println( "enter the value of a");
        int a= sc.nextInt();
        System.out.println( "enter the value of b");
        int b= sc.nextInt();
//        int a=6;
//        int b=4;
        int c;
        c=add(a,b);
//        methods sum=new methods(); with object creating
////        int result =sum.add(a,b);
       int result =add(a,b);
        System.out.println(result);


    }
}






