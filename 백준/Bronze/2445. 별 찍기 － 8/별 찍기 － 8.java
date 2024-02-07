import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        for (int i = 0; i < star; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("*");
            }
            for (int k = star; k > i + 1; k--) {
                System.out.printf(" ");
            }
            for (int l = star; l > i+1; l--) {
                System.out.printf(" ");
            }
            for (int m = 0; m < i+1; m++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        for (int i = 0; i < star; i++) {
            for (int j = star; j > i + 1; j--) {
                System.out.printf("*");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.printf(" ");
            }
            for (int l = 0; l < i + 1; l++) {
                System.out.printf(" ");
            }
            for (int m = star; m > i + 1; m--) {
                System.out.printf("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
