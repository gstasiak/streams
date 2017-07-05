import java.util.stream.Stream;


public class Main4 {

    public static void main(String[] args) {

        Stream.of("d2", "a2", "b1", "b3", "c")
              .filter(s -> {
                  System.out.println("filter: " + s);
                  return s.startsWith("d");
              });
        //Cel: Co zostanie wypisane?


    }
}
