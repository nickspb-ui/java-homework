interface FirstInterface {
    default void f() {

    }
}

interface SecondInterface {
    default void f() {

    }
}

class ImplemetingClass implements FirstInterface, SecondInterface {
    @Override
    public void f() {

    }
}
