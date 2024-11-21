class BaseClass {
    static int add(int x) {
        return x + 1;
    }

    static int add(int x, int y) { // Overloading
        return x + y;
    }

    public void greet() {
        System.out.println("Hello!");
    }
}

class ChildClass extends BaseClass {
    @Override
    public void greet() {
        System.out.println("Hi!");
    }
}

class MethodsExample {
    public static void main(String[] args) {
        System.out.println(BaseClass.add(1)); // 2
        System.out.println(BaseClass.add(1, 2)); // 3
        (new BaseClass()).greet(); // Hello!
        (new ChildClass()).greet(); // Hi!
    }
}