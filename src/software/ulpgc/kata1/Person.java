package software.ulpgc.kata1;

import java.time.LocalDate;

public class Person {
    private final LocalDate birthdate;
    private final String name;

    public Person(LocalDate birthdate, String name) {
        this.birthdate = birthdate;
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "birthdate=" + birthdate +
                ", name='" + name + '\'' +
                '}';
    }
}
