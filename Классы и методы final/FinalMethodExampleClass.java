public class FinalMethodExampleClass {
    public final void greet() {
        System.out.println("Hello world!");
    }
}

class ChildClass extends FinalMethodExampleClass {
    @Override
    public void greet() { // Cannot override the final method from FinalMethodExampleClass
        System.out.println("Hi world!");
    }
}
