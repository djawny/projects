package sda.zadanie13_sortowanie_kolekcji_klasa_anonimowa_swing;

public class Person {
    String firstName;
    String lastName;
    int birthYear;

    public Person(String firstName, String secondName, int birthYear) {
        this.firstName = firstName;
        this.lastName = secondName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return firstName
                + ", " + lastName
                + ", " + birthYear;
    }

    public String toComplexString() {
        return "Osoba" + System.lineSeparator()
                + "\tImię: " + firstName + System.lineSeparator()
                + "\tNazwisko: " + lastName + System.lineSeparator()
                + "\tRok urodzenia: " + birthYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (birthYear != person.birthYear) {
            return false;
        }

//        if(firstName != null){
//            if(!firstName.equals(person.firstName)){
//                return false;
//            }
//        } else {
//            if( person.firstName != null){
//                return false;
//            }
//        }

        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        return lastName != null ? lastName.equals(person.lastName) : person.lastName == null;
    }
}
