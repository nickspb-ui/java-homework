interface Interface {
    void doLogic();

    class NestedClass {
        static void f() {

        }
    }
}

class Main {
    public static void main(String[] args) {
        Interface.NestedClass.f();
    }
}
