class AnotherGenericsExampleClass<T> {
    public T field;

    public void setField(T fieldVal) {
        this.field = fieldVal;
    }

    public T getField() {
        return this.field;
    }

    public void greetExtending(AnotherGenericsExampleClass<? extends T> smthToGreet) {
        System.out.println("Hello, something that is extending Number");
    }

    public void greetSuper(AnotherGenericsExampleClass<? super T> smthToGreet) {
        System.out.println("Hello, something that is super for Number");
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