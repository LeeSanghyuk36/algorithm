import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /** 최대값
         * 9 *9 칸
         * 그 안에 최대값을 찾고 몇 행 몇 열에 있는 수인지 구하기
         */
        Scanner sc = new Scanner(System.in);

        int i,j;
        int max = 0;
        int x = 1, y = 1;

        int arr[][] = new int[9][9];

        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    x= i+1;
                    y = j+1;
                }
            }
        }
        sc.close();
        System.out.println(max);
        System.out.println(x + " " + y);
    }
}
