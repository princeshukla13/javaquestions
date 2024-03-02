class Discout{
    public static void main(String[] args){
        int unit=5,cost=100,total=0;
        int discount=0,bill=0;

        total=unit*cost;
        if(total>=1000){
            discount=total*15/100;
            bill=total-discount;
        }
        System.out.println("total payment =" +total);
        System.out.println("discount =" +discount);
        System.out.println("totalbill with discount =" +bill);
    }
}