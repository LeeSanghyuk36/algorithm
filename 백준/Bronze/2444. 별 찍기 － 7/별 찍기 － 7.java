import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
        /*
        첫줄에 별 1개. 두번째 줄에 별 3개. 3번째 5개, 4번째 7개, 5번째에 9개
        1 - 3 - 5 - 7 - 9
         2    2   2   2
         2개씩 늘어나는 별.
         그리고 n에 닿으면 이제 다시 2개씩 줄어드는 별.
         별찍기 6을 거꾸로 하면 될 것 같다. 먼저 공백을 찍자
         */
        // 상부
        for (int i = 1; i <= star; i++) {
            for (int k = 0; k < star - i; k++) {
                System.out.printf(" ");
            }
            for (int k = 0; k < i + (i - 1); k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        for (int i = star - 1; i > 0; i--) {
            for (int k = 0; k < star - i; k++) {
                System.out.printf(" ");
            }
                for (int k = 0; k < i + (i - 1); k++) {
                    System.out.printf("*");
                }
            System.out.println();
            }
        }
}
