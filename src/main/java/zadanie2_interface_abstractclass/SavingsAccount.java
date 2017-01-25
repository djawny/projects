package zadanie2_interface_abstractclass;

public class SavingsAccount extends AbstractAccount {

    public static final double INTEREST_RATE = 0.05;

    @Override
    public double getMoneyAfterYear() {
        return money + money * INTEREST_RATE;
    }

    @Override
    public String toString() {
        return "Konto odzczednosciowe o stanie " + money;
    }
}
