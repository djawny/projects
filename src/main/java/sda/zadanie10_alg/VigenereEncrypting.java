package sda.zadanie10_alg;

/**
 * Created by RENT on 2016-12-20.
 */
public class VigenereEncrypting {
    private char[][] vigenereTable;

    public VigenereEncrypting() {

        vigenereTable = new char[26][26];
        int beginning;
        for (int i = 0; i < vigenereTable.length; i++) {
            beginning = 65;
            for (int j = 0; j < vigenereTable.length; j++) {
                vigenereTable[i][j] = (char) (beginning + i + j);
                if (i + j + beginning == 90) beginning = 39;
            }
        }

//        for (int i = 0; i < vigenereTable.length; i++) {
//            for (int j = 0; j < vigenereTable.length; j++) {
//                System.out.print(" " + vigenereTable[i][j]);
//            }
//            System.out.println();
//        }
    }


    public static String encrypt(String text, String cipherKey) {

        VigenereEncrypting vigenereEncrypting = new VigenereEncrypting();
        char[] chars = text.toCharArray();
        char[] cipherKeyChars = cipherKey.toCharArray();
        char[] newCipherKeyChars = new char[chars.length];

        int k = 0;
        for (int i = 0; i < newCipherKeyChars.length; i++) {
            if (chars[i] != ' ') {
                newCipherKeyChars[i] = cipherKeyChars[k++];
            } else {
                newCipherKeyChars[i] = ' ';
            }
            if (k == cipherKeyChars.length) k = 0;
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ')
                chars[i] = vigenereEncrypting.vigenereTable[(int) chars[i] - 65][(int) newCipherKeyChars[i] - 65];
        }

        return new String(chars);
    }

    public static String decrypt(String text, String cipherKey) {

        VigenereEncrypting vigenereEncrypting = new VigenereEncrypting();
        char[] chars = text.toCharArray();
        char[] cipherKeyChars = cipherKey.toCharArray();
        char[] newCipherKeyChars = new char[chars.length];

        int k = 0;
        for (int i = 0; i < newCipherKeyChars.length; i++) {
            if (chars[i] != ' ') {
                newCipherKeyChars[i] = cipherKeyChars[k++];
            } else {
                newCipherKeyChars[i] = ' ';
            }
            if (k == cipherKeyChars.length) k = 0;
        }
        int j;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                j = 0;
                while (true) {
                    if (chars[i] == vigenereEncrypting.vigenereTable[j][(int)newCipherKeyChars[i]-65]) {
                        chars[i] = (char) (j + 65);
                        break;
                    }
                    j++;
                }
            }
        }
        return new String(chars);
    }
}
