class BaseClass {
    int number;

    public void greetNumber() {
        System.out.println("Hello, " + number);
    }
}

class ChildClass extends BaseClass {
    @Override
    public void greetNumber() {
        System.out.println("Hi, " + number);
    }
}

class OverridingExample {
    public static void main(String[] args) {
        BaseClass baseClassObj = new BaseClass();
        ChildClass childClassObj = new ChildClass();

        baseClassObj.greetNumber();
        childClassObj.greetNumber();
    }
}