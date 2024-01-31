import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 물화생지 4개 중 3개
         * 역사, 지리 둘 중 하나
         * 총 4개 과목을 선택. 그 합을 구한다.
         * 이 때 선택한 과목의 점수의 합들이 가장 높은 과목들의 총점수를 구한다.
         * 일단 물화생지 중에서 3개 고르는 식. 반복문 돌리고 안에서 sum이 가장 큰 방식을 어떻게 구하지?
         */
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int min = 100;
        for (int i = 0; i < 4; i++) {
            int n = Integer.parseInt(sc.nextLine());
            sum += n;
            if (min > n) {
                min = n;
            }
        }
        sum -= min;
        min = 100;
        for (int i = 0; i < 2; i++) {
            int n = Integer.parseInt(sc.nextLine());
            sum += n;
            if (min > n) {
                min = n;
            }
        }
        sum -=min;
        System.out.println(sum);
    sc.close();
    }
}
