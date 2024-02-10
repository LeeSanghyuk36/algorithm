import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int now = 0;
        int most = 0;

        for (int i = 0; i < 4; i++) {
            now -= sc.nextInt();
            now += sc.nextInt();
            if (now > most) {
                most = now;
            }
        }
        System.out.println(most);
        sc.close();
    }
}
