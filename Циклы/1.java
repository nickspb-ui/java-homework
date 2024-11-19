class LoopExample {
    public static void whileEndless() {
        int i = 0;
        while (true) {
            System.err.println(i);
        }
    }

    public static void doWhileEndless() {
        int i = 0;
        do {
            System.err.println(i);
        } while (true);
    }

    public static void main(String[] args) {
        whileEndless();
        doWhileEndless();
    }
}