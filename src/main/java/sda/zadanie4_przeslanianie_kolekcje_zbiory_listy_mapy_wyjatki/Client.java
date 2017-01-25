package sda.zadanie4_przeslanianie_kolekcje_zbiory_listy_mapy_wyjatki;

/**
 * Created by RENT on 2016-12-11.
 */
public class Client {
    private String name;
    private String surname;
    private int birthYear;

    public Client(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Client) {
            Client client = (Client) obj;
            return name.equals(client.name) && surname.equals(client.surname) && birthYear == client.birthYear;
        } else {
            return false;
        }
    }
}
