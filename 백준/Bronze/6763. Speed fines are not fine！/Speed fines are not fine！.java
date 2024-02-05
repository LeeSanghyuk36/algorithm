import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limitSpeed = sc.nextInt();
        int speed = sc.nextInt();
        if (speed >= limitSpeed + 31) {
            System.out.printf("You are speeding and your fine is $500.");
        } else if (speed >= limitSpeed + 21) {
            System.out.printf("You are speeding and your fine is $270.");
        } else if (speed >= limitSpeed + 1) {
            System.out.printf("You are speeding and your fine is $100.");
        } else {
            System.out.printf("Congratulations, you are within the speed limit!");
        }
        sc.close();
    }
}
