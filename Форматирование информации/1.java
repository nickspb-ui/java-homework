import java.util.Formatter;

class FormatterExample {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        System.out.print(formatter.format("%b, %%, %s %c%d", true, "hello", 'w', 0));
    }
}