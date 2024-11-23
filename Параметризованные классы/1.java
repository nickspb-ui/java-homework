class GenericsExample<T> {
    public T field;

    public void setField(T fieldVal) {
        this.field = fieldVal;
    }

    public T getField() {
        return this.field;
    }
}

class Main {
    public static void main(String[] args) {
        GenericsExample<Integer> exampleInteger = new GenericsExample<Integer>();
        exampleInteger.setField(1);

        System.out.println(exampleInteger instanceof GenericsExample<Integer>); // true
        System.out.println(exampleInteger instanceof GenericsExample); // true
        System.out.println(exampleInteger.getField() instanceof Integer); // true
    }
}