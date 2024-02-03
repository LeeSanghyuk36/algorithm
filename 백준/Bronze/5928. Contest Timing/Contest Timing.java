import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 각각 D, H, M을 입력받음
        int D = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();

        // 시작 시간과 기준 시간을 분 단위로 계산
        int startMinutes = 11 * 24 * 60 + 11 * 60 + 11;
        int targetMinutes = D * 24 * 60 + H * 60 + M;

        // 만약 시작 시간이 기준 시간보다 늦다면 -1 출력 후 프로그램 종료
        if (startMinutes > targetMinutes) {
            System.out.println(-1);
            return;
        }

        // 기준 시간과 시작 시간의 차이를 계산하고 출력
        int difference = targetMinutes - startMinutes;
        System.out.println(difference);
    }
}
