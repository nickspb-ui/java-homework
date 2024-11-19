class LoopOperatorsExample {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            i += 1;
            if (i == 0) {
                continue;
            }
            if (i > 5) {
                break;
            }
            i += 1;
        }
    }
}