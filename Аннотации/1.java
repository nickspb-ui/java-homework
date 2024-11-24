class A {
    public void greet() {
        System.out.println("Hello world!");
    }

    @Deprecated
    public void oldGreet() {
        System.out.println("Greetings to world!");
    }

    @SuppressWarnings(value = { "unused" })
    public void uselessMethod() {
        int a; // The value of the local variable a is not used
    }
}

class B extends A {
    @Override
    public void greet() {
        System.out.println("Hi world!");
    }
}