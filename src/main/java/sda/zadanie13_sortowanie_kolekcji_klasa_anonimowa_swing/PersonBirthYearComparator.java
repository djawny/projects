package sda.zadanie13_sortowanie_kolekcji_klasa_anonimowa_swing;

import java.util.Comparator;

public class PersonBirthYearComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getFirstName().compareTo(person2.getFirstName());
    }
}

