package sda.zadanie19_json.zad1;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private List<CreditCard> creditCards = new ArrayList<>();
    private Person owner;
    private int id;

    public Account() {
    }

    public Account(List<CreditCard> creditCards, Person owner, int id) {
        this.creditCards = creditCards;
        this.owner = owner;
        this.id = id;
    }

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "creditCards=" + creditCards +
                ", owner=" + owner +
                ", id=" + id +
                '}';
    }
}
