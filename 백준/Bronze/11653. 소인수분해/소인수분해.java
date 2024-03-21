import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int start = 2;

        while (n  > 1) {
            if (n % start == 0) {
                System.out.println(start);
                n/=start;
            } else start++;

        }
        sc.close();
    }
}
