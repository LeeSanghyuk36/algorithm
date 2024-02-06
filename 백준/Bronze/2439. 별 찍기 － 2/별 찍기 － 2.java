import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        for (int i = 0; i < star; i++) {
            for (int k = star; k > i+1; k--) {
                System.out.printf(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
