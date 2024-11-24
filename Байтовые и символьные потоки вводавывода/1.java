import java.io.FileInputStream;
import java.io.IOException;

class InputExample {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("input.txt")) {
            System.out.println(input.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}