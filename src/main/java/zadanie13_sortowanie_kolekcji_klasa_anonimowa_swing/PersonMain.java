package zadanie13_sortowanie_kolekcji_klasa_anonimowa_swing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {

        List personList = new ArrayList<>();
        personList.add(new Person("Jan", "Kowalski", 1980));
        personList.add(new Person("Adam", "Mickiewicz", 1960));
        personList.add(new Person("Adam", "Adamski", 1970));
        personList.add(new Person("Lukasz", "Mickiewicz", 1990));
        personList.add(new Person("Piotr", "Mickiewicz", 1975));

        Collections.sort(personList, new Comparator<Person>() {
                    @Override
                    public int compare(Person person1, Person person2) {
                        return person1.getFirstName().compareTo(person2.getFirstName());
                    }
                }
        );
        for (Object object : personList) {
            System.out.println(object);
        }
    }
}
