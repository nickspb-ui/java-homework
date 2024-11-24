import java.util.StringJoiner;

class StringJoinerExample {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "Hello ", "!");
        String result = joiner.add("world").add("planet").add("universe").toString();
        System.out.println(result);
    }
}
