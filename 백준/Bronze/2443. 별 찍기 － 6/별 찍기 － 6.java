import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
        /*
        첫 줄에 5라면 2*N-1개 9개. 2*N-3 5개를 찍는 문제. 
        9, 7, 5, 3, 1
        -1, -3, -5, -7, -9
        -> 2*star - (i * 2 - 1)
         */
        // 첫 for문
        for (int i = 1; i <= star ; i ++) {
            // 공백 찍기
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            //별 찍기
            for (int k = (2 * star) - (i * 2 - 1); k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}