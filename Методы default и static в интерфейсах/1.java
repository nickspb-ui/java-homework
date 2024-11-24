interface Interface {

    default void defaultMethod() {
        System.out.println("default interface method");
    }

    static void staticMethod() {
        System.out.println("static interface method");
    }
}

class ExampleClass implements Interface {

}

class DefaultExample {
    public static void main(String[] args) {
        ExampleClass obj = new ExampleClass();
        Interface intf = new ExampleClass();

        Interface.staticMethod();
        obj.defaultMethod();
        intf.defaultMethod();
    }
}