package sda.zadanie4_przeslanianie_kolekcje_zbiory_listy_mapy_wyjatki;

public class IllegalFieldException extends Exception {
    private String fieldName;

    public IllegalFieldException(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }
}
