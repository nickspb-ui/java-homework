class OuterClass {
    private int outerField;

    private void outerMethod() {
        InnerClass obj = new InnerClass();

        System.out.println(obj.innerField);
    }

    class InnerClass {
        private int innerField;

        private void innerMethod() {
            System.out.println(outerField);
        }
    }
}
