import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {
            int stuNum = sc.nextInt();
            System.out.print(stuNum);
            int st = sc.nextInt();
            int stScore = st * 100 / 35;
            int mg = sc.nextInt();
            int mgScore = mg * 100/25;
            int sk = sc.nextInt();
            int skScore = sk * 100/35;
            int score = st + mg + sk;

            if (stScore >= 30 && mgScore >= 30 && skScore >= 30 && score >= 55) {
                System.out.println(" "+ score + " PASS");
            } else {
                System.out.println(" "+score + " FAIL");
            }


        }
        sc.close();
    }
}
