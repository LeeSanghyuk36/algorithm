import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // A 입력
        int b = sc.nextInt(); // B 입력
        int n = sc.nextInt(); // N 입력

        int target = a % b;

        for (int i = 0; i < n - 1; i++) {
            target *= 10;
            target %= b;
        }
        target *= 10;
        System.out.println(target/b);

        sc.close();
    }
}
