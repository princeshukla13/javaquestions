package com.company;

public class methodoverloading {
//    static void r(){
//        System.out.println("ram");
//    }
//    static void r( int a){
//        System.out.println(a);
//    }

  static   String formatNumber(int value) {
            return String.format("%d", value);

        }

        static String formatNumber(double value) {
            return String.format("%.3f", value);
        }

        static String formatNumber(String value) {
            return String.format("%.2f", Double.parseDouble(value));
        }



    public static void main(String[] args) {
        methodoverloading m = new methodoverloading();
        System.out.println(m.formatNumber(500));
        System.out.println(m.formatNumber(89.9934));
        System.out.println(m.formatNumber("550"));
    }
}
//        r();
//        r(2000);
//    }
//}
