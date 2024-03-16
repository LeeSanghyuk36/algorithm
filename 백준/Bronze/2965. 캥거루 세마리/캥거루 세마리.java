import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int maxMoves = Math.max(B - A, C - B) - 1;
        System.out.println(maxMoves);

        scanner.close();
    }
}
