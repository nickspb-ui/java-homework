class AnotherGenericsExampleClass<T> {
    public T field;

    public void setField(T fieldVal) {
        this.field = fieldVal;
    }

    public T getField() {
        return this.field;
    }

    public static void greetExtending(AnotherGenericsExampleClass<? extends Number> smthToGreet) {
        System.out.println("Hello, something extending Number");
    }

    public static void greetSuper(AnotherGenericsExampleClass<? super Number> smthToGreet) {
        System.out.println("Hello, something that is super for Number");
    }
}

class AnotherGenericsExample {
    public static void main(String[] args) {
        AnotherGenericsExampleClass.greetExtending(new AnotherGenericsExampleClass<Integer>());
        AnotherGenericsExampleClass.greetSuper(new AnotherGenericsExampleClass<Number>());
    }
}