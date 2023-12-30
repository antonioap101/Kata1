import software.ulpgc.kata1.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person daniel = new Person(LocalDate.of(2000, 2, 15), "Daniel");

        System.out.println("Person: " + daniel);
    }
}