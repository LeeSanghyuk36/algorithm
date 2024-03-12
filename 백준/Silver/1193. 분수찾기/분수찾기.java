import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 배열을 지그재그로 순회하며 x번째 분수를 구하는 것
         * 1/1 1/2 2/1 3/1 2/2 1/3
         * 분자 분모 합이 5면 1/4 2/3 3/2 4/1
         */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        int line = 1; // 대각선의 개수
        int cnt = 1; // 대각선을 지난 횟수

        //대각선을 지나면서 x 보다 커지는 지점을 찾기
        while (cnt + line <= x) {
            cnt += line;
            line++;
        }
        int diff = x - cnt;

        int numerator; // 분자
        int denominator; // 분모

        // 대각선의 개수가 홀수일 때
        if (line % 2 == 1) {
            numerator = line - diff;
            denominator = diff + 1;
        } else {
            numerator = diff + 1;
            denominator = line - diff;
        }
        System.out.println(numerator+ "/" + denominator);

    }
}
