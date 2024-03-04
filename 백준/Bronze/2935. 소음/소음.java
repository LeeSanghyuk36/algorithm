import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger num1 = new BigInteger(sc.next());
        String ch = sc.next();
        BigInteger  num2 = new BigInteger(sc.next());

        if (ch.equals("+")) {
            System.out.println(num1.add(num2));
        } else System.out.println(num1.multiply(num2));

        sc.close();
    }
}
