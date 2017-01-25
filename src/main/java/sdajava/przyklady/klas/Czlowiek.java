package sdajava.przyklady.klas;

public class Czlowiek {

    private double waga;
    private String imie;
    private String nazwisko;

    public Czlowiek() {
    }

    public Czlowiek(double waga, String imie, String nazwisko) {
        this.waga = waga;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public static Czlowiek createForm(String fullname) {
        String[] splitName = fullname.split(" ");
        String imie = splitName[0];
        String nazwisko = splitName[1];
        Czlowiek czlowiek = new Czlowiek(80, imie, nazwisko);
        return czlowiek;
    }
}
