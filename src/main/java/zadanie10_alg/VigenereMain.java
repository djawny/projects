package zadanie10_alg;

public class VigenereMain {
    public static void main(String[] args) {

        String text = "ALA MA KOTA SIERSCIUCHA";
        String cipherKey = "TAJNE";

        String encrypt = VigenereEncrypting.encrypt(text, cipherKey);
        System.out.println("Tekst wejsciowy:");
        System.out.println(text);
        System.out.println("Klucz:");
        System.out.println(cipherKey);
        System.out.println("Zaszyfrowany tekst to:");
        System.out.println(encrypt);
        String decrypt = VigenereEncrypting.decrypt(encrypt,cipherKey);
        System.out.println("Odszyfrowany tekst to:");
        System.out.println(decrypt);

    }
}
