class Main {
    public static void main(String[] args) {
        try {
            int a = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        int b = 1 / 0;
    }
}