import examplePackage.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Class from another package: ");
        // System.out.println(AccessExample.privateNum); // The field
        // AccessExample.privateNum is not visible
        // System.out.println(AccessExample.nonSpecNum); // The field
        // AccessExample.nonSpecNum is not visible
        // System.out.println(AccessExample.protectedNum); // The field
        // AccessExample.protectedNum is not visible
        System.out.println(AccessExample.publicNum); // 4
        AccessExample.callNums();
    }
}