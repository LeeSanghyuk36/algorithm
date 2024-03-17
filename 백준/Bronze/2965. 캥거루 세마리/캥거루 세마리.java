import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int maxDiff = B - A > C - B ? B - A : C - B;
        int maxMoves = maxDiff - 1;
        System.out.println(maxMoves);

        scanner.close();
    }
}
