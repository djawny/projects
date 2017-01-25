package sda.zadanie14_przeslanianie_w_interfejsach;

public class Knight {
    private Weapon weapon;

    public Knight(Weapon weapon) {
        this.weapon = weapon;
    }

    public Knight() {
    }

    public void fight() {
        System.out.println("Knight is fighting...");
        weapon.use();
    }

    public static void main(String[] args) {
        Knight knight1 = new Knight(new Sword());
        knight1.fight();

        Knight knight2 = new Knight(new Axe());
        knight2.fight();

        Knight knight3 = new Knight(new Weapon() {
            @Override
            public void use() {
                System.out.println("Bashing using club");
            }
        });
        knight3.fight();

        Knight knight4 = new Knight(() -> System.out.println("Bashing using club"));
        knight4.fight();
    }
}
