public class inverted_with_no {
    public static void main(String[] args) {
        int n =4;
        int i,j;
        for (i=1;i<=n;i++){
            for (j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }


    }

}

