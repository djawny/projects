package zadanie10_alg;

public class GCD {
    public static int gcd(int k, int n) {
        if (k == 0) {
            return n;
        } else {
            return gcd(n % k, k);
        }
    }
}
