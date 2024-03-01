import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int songCnt = sc.nextInt();
        int avg = sc.nextInt();

        // 곡의 개수와 평균값을 곱한 후 평균값에 1을 빼서 결과를 출력합니다.
        System.out.println(songCnt * (avg - 1) + 1);
    }
}
