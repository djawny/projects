package sda.zadanie10_alg;


import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MorseConverter {
    public static String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
            "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "0", " "};
    public static String[] dottie = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----", "|"};
    public static BiMap<String, String> alphaDotti = HashBiMap.create();

    static {
        for (int i = 0; i < alpha.length; i++) {
            alphaDotti.put(alpha[i], dottie[i]);
        }
    }

    public static String convertChar(String charToConvert, boolean toMorse) {
        charToConvert = charToConvert.toLowerCase();
        if (toMorse) {
            return alphaDotti.get(charToConvert);
        } else {
            return alphaDotti.inverse().get(charToConvert);
        }
    }

    public static String convertToMorse(String text) {
        String[] split = text.split("");
        StringBuilder morseString = new StringBuilder();

        for (String element : split) {
            String convertedChar = convertChar(element, true);
            morseString.append(convertedChar);
            morseString.append(" ");
        }
        return morseString.toString();
    }

    public static String convertToMorseStream(String text) {
//        return Arrays.stream(text.split(""))
//                .map(letter -> alphaDotti.get(letter.toLowerCase()))
//                .collect(Collectors.joining(" "));
//        return Arrays.stream(text.split(""))
//                .map(letter -> dottie[Arrays.asList(alpha).indexOf(letter.toLowerCase())])
//                .collect(Collectors.joining(" "));
        return Arrays.stream(text.split(""))
                .map(letter -> dottie[IntStream.range(0, alpha.length - 1).filter(i -> alpha[i].equals(letter.toLowerCase())).sum()])
                .collect(Collectors.joining(" "));
    }

    public static String convertToText(String textInMorse) {
        String[] split = textInMorse.split(" ");
        StringBuilder text = new StringBuilder();

        for (String element : split) {
            String convertedChar = convertChar(element, false);
            text.append(convertedChar);
        }
        return text.toString();
    }
}
