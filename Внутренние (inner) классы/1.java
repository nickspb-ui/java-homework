class AccessExampleClass {
    PrivateInnerClass field;

    private class PrivateInnerClass {

    }

    public class PublicInnerClass {

    }
}

class AccessExample {
    public static void main(String[] args) {
        AccessExampleClass.PrivateInnerClass obj1 = new AccessExampleClass().new PrivateInnerClass(); // The type
        // AccessExampleClass.PrivateInnerClass is
        // not visible

        AccessExampleClass.PublicInnerClass obj2 = new AccessExampleClass().new PublicInnerClass();
    }
}