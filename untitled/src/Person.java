import java.util.HashSet;
import java.util.Set;

/**
 * Created by Robert on 29.06.2017.
 */


public class Person {
    String name;
    int age;
    Long id;
    Set<String> books;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(Long id, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", id=" + id + ", books=" + books + '}';
    }

    public void addBook(String book) {
        if (this.books == null) {
            this.books = new HashSet<>();
        }
        this.books.add(book);
    }

    public Set<String> getBooks() {
        return books;
    }

    public void setBooks(Set<String> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Person)) {
            return false;
        }

        Person person = (Person) o;

        if (age != person.age) {
            return false;
        }
        if (name != null ? !name.equals(person.name) : person.name != null) {
            return false;
        }
        return id != null ? id.equals(person.id) : person.id == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
