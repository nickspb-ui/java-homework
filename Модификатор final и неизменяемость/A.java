public class A {
    public final int a;

    A() {
        a = 1;
    }

    A(int _a) {
        a = _a;
    }
}

class AnotherA {
    public final int a;
    {
        a = 1;
    }
}