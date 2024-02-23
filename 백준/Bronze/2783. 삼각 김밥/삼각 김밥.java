import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double seven25_gram = sc.nextDouble();
        double seven25_won = sc.nextDouble();
        int combinience_store = sc.nextInt();

        double seven_thowsend = seven25_gram/ seven25_won  * 1000;
        double mn_thowsend = seven_thowsend;
        for (int i = 0; i < combinience_store; i++) {
            double another_gram = sc.nextDouble();
            double another_won = sc.nextDouble();
            double another_thowsend = another_gram /another_won * 1000;
            if (another_thowsend < mn_thowsend) {
                mn_thowsend = another_thowsend;
            }
        }
        System.out.printf("%.2f", mn_thowsend);

        sc.close();

    }
}
