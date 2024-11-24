class OverloadingExampleClass {
    int field;

    public int fieldPlusOne() {
        return field + 1;
    }

    public int fieldPlusNumber(int num) {
        return field + num;
    }
}

class OverloadingExample {
    public static void main(String[] args) {
        OverloadingExampleClass obj = new OverloadingExampleClass();

        System.out.println(obj.fieldPlusOne()); // 1
        System.out.println(obj.fieldPlusNumber(2)); // 2
    }
}