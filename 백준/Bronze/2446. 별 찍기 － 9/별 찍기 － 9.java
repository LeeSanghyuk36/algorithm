import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        // 위쪽 삼각형 출력
        for (int i = 0; i < star; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = star * 2 - 1; k > i * 2; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아래쪽 삼각형 출력
        for (int i = 1; i < star; i++) {
            for (int j = star - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
