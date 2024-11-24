class StringCastExamples {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("hello");
        StringBuffer buffer = new StringBuffer("hello");
        String str = "hello";

        String builderToStr = builder.toString();
        String bufferToStr = buffer.toString();

        StringBuilder strToBuilder = new StringBuilder(str);
        StringBuilder bufferToBuilder = new StringBuilder(buffer);

        StringBuffer strToBuffer = new StringBuffer(str);
        StringBuffer builderToBuffer = new StringBuffer(builder);
    }
}