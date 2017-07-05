import java.util.stream.Stream;


public class Main5 {

    public static void main(String[] args) {

        Stream.of("d2", "a2", "b1", "b3", "c")
              .map(String::toUpperCase)
              .anyMatch(s -> s.startsWith("A"));


        //Cel: Dla ilu obiektów uruchomi się map, a dla ilu anyMatch?



    }
}
