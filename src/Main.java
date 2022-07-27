import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        findFirstOdd();
        findWordsEndingWith();
        countInstances();
        mapOptionals();
    }

    // print the first odd number in the list and if there isn't one return -1
    static void findFirstOdd() {
        List<Integer> ints = Arrays.asList(10, 32, 56, 7, 11, 88, 15, 76, 43, 30);
        List<Integer> intsNoOddNumbers = Arrays.asList(10, 32, 56, 10, 18, 88, 16, 76, 42, 30);

        System.out.println("First odd number: ");
        System.out.println("First odd number: ");
    }
    // find any words that end with an 'e' or 's' in the string and print the result
    static void findWordsEndingWith() {
        String text = "less more high low see fly fast slow codes";
        System.out.println("Words ending with an 'e' or 's': " );
    }

    // print how many instances of each word are in the list e.g. "{red=1, "green=2, "blue=3}"
    static void countInstances() {
        List<String> colours = Arrays.asList("blue", "red", "green", "blue", "green", "blue");
        System.out.println("Colour count: ");
    }

    // print the age of the person or throw an exception if they don't have one
    static void mapOptionals() {
        Optional<Person> personOptional1 = Optional.of(new Person("Alice", 26));
        Optional<Person> personOptional2 = Optional.of(new Person("Bob"));

        System.out.println("Person 1 Age: ");
        System.out.println("Person 2 Age: ");
    }

    public static class Person {
        private final String name;
        private final Integer age;

        public Person(String name) {
            this(name, null);
        }

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public Optional<String> getName() {
            return Optional.ofNullable(name);
        }

        public Optional<Integer> getAge() {
            return Optional.ofNullable(age);
        }
    }
}