import java.util.function.Supplier;
import java.util.stream.Stream;


public class Main7 {

    public static void main(String[] args) {

        Stream<String> stream =
                Stream.of("d2", "a2", "b1", "b3", "c")
                      .filter(s -> s.startsWith("a"));

        System.out.println(stream.anyMatch(s -> s.startsWith("b")));
        System.out.println(stream.anyMatch(s -> s.startsWith("a")));

        //Cel: jaki będzie wynik?



    }
}
