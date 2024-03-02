import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[]no= {2,3,45,67};
       System.out.println(no[3]);
        System.out.println(no.length);
        System.out.println(Arrays.stream(no).min());
        System.out.println(Arrays.stream(no).max());
        for (int i = 0; i < no.length; i++){
            System.out.println(no [i]);
            }


//            for (int i:no){
//                System.out.println(i);
        }
    }


