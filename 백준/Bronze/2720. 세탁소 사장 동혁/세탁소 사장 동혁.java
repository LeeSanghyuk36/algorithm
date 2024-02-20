import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int i = 0; i < tc; i++) {
            int coin = sc.nextInt();
            int quarter = 0;
            int dime =0;
            int nickel =0;
            int penny = 0;
            quarter = coin / 25;
            coin = coin % 25;
            dime = coin / 10;
            coin = coin % 10;
            nickel = coin / 5;
            coin =coin % 5;
            penny = coin / 1;
            coin = coin % 1;
            System.out.println(quarter+ " "+ dime + " " + nickel + " " + penny);
        }
    }
}
