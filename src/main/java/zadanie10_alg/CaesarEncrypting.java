package zadanie10_alg;

public class CaesarEncrypting {
    public static String encrypt(String text, int offset) {

        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (offset + chars[i]);
        }

        return new String(chars);
    }

    public static String decrypt(String text, int offset) {

        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] - offset);
        }

        return new String(chars);
    }
}