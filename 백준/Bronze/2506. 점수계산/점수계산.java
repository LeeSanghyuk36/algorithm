import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        int score = 0;
        int frequently = 0;

        int[] numbs = new int[tc];

        for (int i = 0; i < tc; i++) {
            numbs[i] = sc.nextInt();
            if (numbs[i] == 1){
                frequently++;
                score += frequently;
                }
            else  frequently = 0;
        }
        System.out.println(score);
        sc.close();
    }
}
