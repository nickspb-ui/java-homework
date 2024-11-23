class AnotherGenericsExampleClass<T> {
    public T field;

    public void setField(T fieldVal) {
        this.field = fieldVal;
    }

    public T getField() {
        return this.field;
    }

    public void greetExtending(AnotherGenericsExampleClass<? extends T> smthToGreet) {
        System.out.println("Hello, something that is extending this object's class");
    }

    public void greetSuper(AnotherGenericsExampleClass<? super T> smthToGreet) {
        System.out.println("Hello, something that is super for this object's class");
    }
}

class AnotherGenericsExample {
    public static void main(String[] args) {
        AnotherGenericsExampleClass<Integer> exampleInteger = new AnotherGenericsExampleClass<Integer>();
        AnotherGenericsExampleClass<Number> exampleNumber = new AnotherGenericsExampleClass<Number>();

        exampleNumber.greetExtending(exampleInteger);
        exampleInteger.greetSuper(exampleNumber);
    }
}