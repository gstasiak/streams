import java.util.stream.Stream;


public class Main6 {

    public static void main(String[] args) {

        Stream.of("d2", "a2", "a1", "b3", "c")
              .sorted((s1, s2) -> {
                  System.out.println("sort: "+ s1 + " " + s2);
                  return s1.compareTo(s2);
              })
              .map(s -> {
                  System.out.println("map: " + s);
                  return s.toUpperCase();
              })
              .filter(s -> {
                  System.out.println("filter: " + s);
                  return s.startsWith("A");
              })
              .forEach(s -> System.out.println("forEach: " + s));

        //Cel: Jak zoptymalizować?
        System.out.println("========================");
        //Sorted stateful



    }
}
