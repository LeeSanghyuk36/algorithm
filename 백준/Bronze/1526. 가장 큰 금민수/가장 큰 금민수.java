import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n > 0) {
            if (isLuckyNumber(n)) {
                System.out.println(n);
                break;
            }
            n--;
        }
        sc.close();
    }

    public static boolean isLuckyNumber(int num) {
        String str = Integer.toString(num);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '4' && str.charAt(i) != '7') {
                return false;
            }
        }
        return true;
    }
}
