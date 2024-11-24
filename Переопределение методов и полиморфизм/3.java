class BaseErrorClass {
    int number;

    public void greetNumber() {
        System.out.println("Hello, " + number);
    }
}

class ChildErrorClass extends BaseClass {
    @Override
    public void greetNum() { // The method greetNum() of type ChildErrorClass must override or implement a
                             // supertype method
        System.out.println("Hi, " + number);
    }
}
