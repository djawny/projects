package sda.zadanie10_alg;

public class MorseMain {
    public static void main(String[] args) {
        String textAlfaNum = "Przykladowy napis 1";
        System.out.println("Text alfanumeryczny:");
        System.out.println(textAlfaNum);
        String textInMorse = MorseConverter.convertToMorse(textAlfaNum);
        System.out.println("Morse code:");
        System.out.println(textInMorse);
        textInMorse = MorseConverter.convertToMorseStream(textAlfaNum);
        System.out.println("Morse code:");
        System.out.println(textInMorse);
        textAlfaNum = MorseConverter.convertToText(textInMorse);
        System.out.println("Text alfanumeryczny:");
        System.out.println(textAlfaNum);
    }
}
