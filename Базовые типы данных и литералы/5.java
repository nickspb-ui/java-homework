class DifferentVarsTypesExample {
    public static void main(String[] args) {
        byte a = 127;
        short b = 3267;
        int res = a + b; // a + b будет иметь тип int, потому что все операнды операции преобразуются к
                         // int при арифметических операциях (кроме случаев, где есть, например, double,
                         // float и т.д.)
    }
}
