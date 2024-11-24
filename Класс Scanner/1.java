import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class ScannerExample {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(new FileReader("input.txt"))) {
            while (scan.hasNext()) {
                System.out.println(scan.next());
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
    }
}