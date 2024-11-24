class Main {
    public static void main(String[] args) {
        try {
            int a = 1 / 0;
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e);
        }

        try {
            Integer.parseInt("null");
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }
}