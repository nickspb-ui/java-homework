public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}

class StaticExample {
    public static void main(String[] args) {
        A objA = new A();
        objA.printVars(); // 1 вариант

        A.printVars(); // 2 вариант
    }
}