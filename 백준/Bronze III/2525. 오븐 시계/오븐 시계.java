import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();
        int need = sc.nextInt();

        int compH = hour;
        int compM = 0;

        compM = min +need;

        while (compM >= 60) {
            ++compH;
            compM -=60;
        }
        while (compH > 23) {
            compH -=24;
        }
        System.out.println(compH + " " + compM);


    }
}
