import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 1바구니에 사과 A개, 오렌지 B개.
         * 2바구니에 사과 C개, 오렌지 D개.
         * 한 바구니에 하나 집어서 다른 바구니로. 한 바구니에는 사과만, 오렌지만 옮기는 것으로.
         * 과일 옮기는 최소 횟수를 구하는 프로그램이 필요.
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int c = sc.nextInt(), d = sc.nextInt();

        System.out.println(Math.min(a + d, b+c));
    }
}
