import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int cnt = 1;

        for (int i = 1; i <= num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a + b;
            System.out.println("Case #" + cnt + ": " + c);
            ++cnt;
        }
        sc.close();
    }
}
