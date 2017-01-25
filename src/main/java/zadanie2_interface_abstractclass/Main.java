package zadanie2_interface_abstractclass;

public class Main {
    public static void main(String[] args) {
        Account account1 = new PersonalAccount();
        account1.addMoney(1000);
        System.out.println("Po roku na koncie osobistym: "
                + account1.getMoneyAfterYear());

        Account account2 = new SavingsAccount();
        account2.addMoney(1000);
        System.out.println("Po roku na koncie oszczednosciowym: "
                + account2.getMoneyAfterYear());

        System.out.println(account1);
        System.out.println(account2);
    }
}
