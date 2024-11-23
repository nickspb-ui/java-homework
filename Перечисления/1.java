class EnumInClassExampleClass {
    enum Group {
        A("first"), B("second"), C("third");

        String groupTag;

        Group(String groupTag) {
            this.groupTag = groupTag;
        }
    }

}
