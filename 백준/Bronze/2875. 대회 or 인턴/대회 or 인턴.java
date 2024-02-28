import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 여학생 수
        int m = sc.nextInt(); // 남학생 수
        int k = sc.nextInt(); // 인턴 참가 학생 수


        int maxTeams = 0;

        // 가능한 최대 팀 수를 구합니다.
        while (n >= 2 && m >= 1 && n + m >= k + 3) {
            n -= 2; // 여학생 2명을 팀에 배정
            m -= 1; // 남학생 1명을 팀에 배정
            maxTeams++; // 팀 수 증가
        }

        System.out.println(maxTeams); // 최대 팀 수 출력

        sc.close();
    }
}
