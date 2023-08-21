import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static boolean[] primes(int k) {
        boolean[] prime = new boolean[k + 1];
        for (int i = 2; i <= k; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i <= k; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= k; j += i) {
                    prime[j]=false;
                }
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        int k = sc.nextInt();

        BigInteger bigP = new BigInteger(p);
        boolean[] prime = primes(k);

        for (int i = 2; i < k; i++) {
            if (prime[i] && bigP.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                System.out.println("BAD " + i);
                return;
            }
        }
        System.out.println("GOOD");
    }
}
