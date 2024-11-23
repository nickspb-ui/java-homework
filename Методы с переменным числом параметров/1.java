class DifferentArgumentsNumberExampleClass {
    public static int getFirstNumber(int... numbers) {
        return numbers[0];
    }

    public static String getFirstString(String... strs) {
        return strs[0];
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(DifferentArgumentsNumberExampleClass.getFirstNumber(1, 2, 3, 4)); // 1
        System.out.println(DifferentArgumentsNumberExampleClass.getFirstString("Hello", "world", "!")); // Hello
    }
}