import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pirates = sc.nextInt();
        for (int i = 1; i <= pirates; i++) {
            System.out.print(i + " ");
            if (i % 6 == 0) {
                System.out.print("Go! ");
            } else if (i == pirates) {
                System.out.print("Go!");
            }
        }
    sc.close();
    }
}
