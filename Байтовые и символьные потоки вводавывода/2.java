import java.io.FileOutputStream;
import java.io.IOException;

class OutputExample {
    public static void main(String[] args) {
        // 2, 4
        try (FileOutputStream output = new FileOutputStream("output.txt")) { // FileOutputStream implements
                                                                             // AutoCloseable
            output.write(92);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}