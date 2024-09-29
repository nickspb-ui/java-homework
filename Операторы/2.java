class SomeClass {
    int a = 1;
}

class InstanceofExample {
    public static void main(String[] args) {
        SomeClass val = new SomeClass();
        System.out.println(val instanceof SomeClass); // true
    }
}