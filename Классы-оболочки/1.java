class DecodeExample {
    public static void main(String[] args) {
        int num;
        try { // Not A Number
            num = Integer.decode("number");
        } catch (NumberFormatException e) {
            System.out.println("Not A Number");
        }
        num = Integer.decode("111"); // num = 111
        num = Integer.decode("0x10"); // num = 16
    }
}
