package examplePackage;

public class AccessExample {
    private static int privateNum = 1;
    static int nonSpecNum = 2;
    protected static int protectedNum = 3;
    public static int publicNum = 4;

    public static void callNums() {
        System.out.println("Original class: ");
        System.out.println(AccessExample.privateNum); // 1
        System.out.println(AccessExample.nonSpecNum); // 2
        System.out.println(AccessExample.protectedNum); // 3
        System.out.println(AccessExample.publicNum); // 4
        AnotherAccessExample.callNums();
    }
}

class AnotherAccessExample {
    public static void callNums() {
        System.out.println("Class from the same package: ");
        // System.out.println(AccessExample.privateNum); The field
        // AccessExample.privateNum is not visible
        System.out.println(AccessExample.nonSpecNum); // 2
        System.out.println(AccessExample.protectedNum); // 3
        System.out.println(AccessExample.publicNum); // 4
    }
}
