import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1, 3, 6

        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int w = sc.nextInt();
            int sum = 0;
            for (int j = 1; j <= w; j++) {
                sum += j * (j + 1) * (j + 2) / 2;
            }
            System.out.println(sum);

        }
        sc.close();
        }
}
