package zadanie2_interface_abstractclass;

public abstract class AbstractAccount implements Account {
    protected double money;

    @Override
    public void addMoney(double amount) {
        money+=amount;
    }
}
