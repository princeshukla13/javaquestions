package com.company;
class Maine {
    int x =3;
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

 static class first{
        int z=10;
}

    // Main method
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method

        Maine myObj = new Maine(); // Create an object of MyClass
        myObj.myPublicMethod(); // Call the public method
        first fs=new first();
        System.out.println(fs.z);



    }
}
