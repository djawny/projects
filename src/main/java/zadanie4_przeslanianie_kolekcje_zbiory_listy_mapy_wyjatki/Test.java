package zadanie4_przeslanianie_kolekcje_zbiory_listy_mapy_wyjatki;

public class Test {
    public double divide(double x, double y) throws Exception {
        if(y ==0){
            throw new Exception("Nie można dzielić przez zero");
        }
        return x / y;
    }
}
