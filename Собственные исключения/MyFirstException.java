public class MyFirstException extends Exception {
    public MyFirstException() {

    }

    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyFirstException(String message) {
        super(message);
    }

    public MyFirstException(Throwable cause) {
        super(cause);
    }
}

class Main {
    public static void main(String[] args) {
        try {
            throw new MyFirstException("my first error");
        } catch (MyFirstException e) {
            System.out.println(e);
        }
    }
}