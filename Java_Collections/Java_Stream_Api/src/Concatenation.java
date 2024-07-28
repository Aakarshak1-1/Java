import java.util.stream.*;

// Write a Java 8 program to concatenate two Streams?

public class Concatenation {
    public static void main(String[] args) {
        Stream<String> str1 = Stream.of("Aakarshak");
        Stream<String> str2 = Stream.of("shotri");
        Stream<String> res_str = Stream.concat(str1, str2);
        res_str.forEach(element -> System.out.print(element));

    }
}