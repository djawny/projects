package sdajava.przyklady.klas;


public class Kalkulator {

    double suma;


    public static double dodaj(double x, double y) {
        return x + y;
    }

    public static double roznica(double x, double y) {
        return x - y;
    }

    double dajSume() {
        return suma;
    }

    void zwiekszSume(double oIle) {
        suma = suma + oIle;
    }

}
