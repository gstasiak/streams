import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main15 {

    public static void main(String[] args) {


        Person p1 = new Person(1L, "Ania", 18);
        Person p2 = new Person(2L, "Dominik", 23);
        Person p3 = new Person(3L, "Jakub", 21);

        p1.addBook("Book1");
        p1.addBook("Book2");
        p1.addBook("Book3");

        p2.addBook("Book4");
        p2.addBook("Book5");
        p2.addBook("Book1");

        p3.addBook("Book1");
        p3.addBook("Book2");
        p3.addBook("Book6");

        List<Person> people = Arrays.asList(p1, p2, p3);

        //Cel: Uzyskać posortowaną listę unikalnych książek osób starszych niż 20 lat.



    }
}
