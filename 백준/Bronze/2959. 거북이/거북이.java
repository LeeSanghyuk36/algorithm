import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * 가장 큰 크기의 직사각형을 만들었을 때 면적을 구해서 출력
         *
         */
        int[] numbers = new int[4];
        for (int i = 0; i < 4; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        int width = Math.min(numbers[0], numbers[1]);
        int height = Math.min(numbers[2], numbers[3]);

        int area = width * height;

        System.out.println(area);

        sc.close();
    }
}
