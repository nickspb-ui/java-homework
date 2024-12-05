class NarrowingExample {
    public static void main(String[] args) {
        byte a = 127;
        short b = 3267;
        short c = (short) (a + b);

        System.out.println(c); // 3394
    }
}
