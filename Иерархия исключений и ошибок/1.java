class ArithmeticExceptionClass {
    public static void err() {
        int result = 10 / 0;
        System.out.println(result);
    }
}

class ArrayIndexOutOfBoundsExceptionClass {
    public static void err() {
        int[] nums = { 1 };
        System.out.println(nums[1]);
    }
}

class IllegalArgumentExceptionClass {
    public static void err() {
        f(0);
    }

    public static void f(int a) {
        if (a == 0) {
            throw new IllegalArgumentException("arg cant be zero");
        }
    }
}

class ClassCastExceptionClass {
    public static void err() {
        Object obj = new String("0");
        Integer a = (Integer) obj;
    }
}

class NullPointerExceptionClass {
    public static void err() {
        String a = null;
        int l = a.length();
    }
}

class Main {
    public static void main(String[] args) {
        try {
            ArithmeticExceptionClass.err();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        try {
            ArrayIndexOutOfBoundsExceptionClass.err();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        try {
            IllegalArgumentExceptionClass.err();
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        try {
            ClassCastExceptionClass.err();
        } catch (ClassCastException e) {
            System.out.println(e);
        }

        try {
            NullPointerExceptionClass.err();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}