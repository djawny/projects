package sda.zadanie23_patterns.observer;

class BankMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Customer customer = new Customer();

        bankAccount.addObserver((Observer) customer);
        bankAccount.changeBalance(100);
    }
}
