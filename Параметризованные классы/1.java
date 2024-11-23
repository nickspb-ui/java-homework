class GenericsExampleClass<T> {
    public T field;

    public void setField(T fieldVal) {
        this.field = fieldVal;
    }

    public T getField() {
        return this.field;
    }
}

class GenericsExample {
    public static void main(String[] args) {
        GenericsExampleClass<Integer> exampleInteger = new GenericsExampleClass<Integer>();
        exampleInteger.setField(1);

        System.out.println(exampleInteger instanceof GenericsExampleClass<Integer>); // true
        System.out.println(exampleInteger instanceof GenericsExampleClass); // true
        System.out.println(exampleInteger.getField() instanceof Integer); // true
    }
}