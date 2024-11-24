import java.util.Date;
import java.util.Formatter;

class FormatterDateExample {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Date date = new Date();
        System.out.print(formatter.format("%tH, %tI, %tM, %tS, %tL", date, date, date, date, date));
    }
}