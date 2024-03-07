import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hex = sc.next();
        int decimal = 0;

        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int digit = Character.isDigit(c) ? c - '0' : c - 'A' + 10;
            decimal = decimal * 16 + digit;
        }

        System.out.println(decimal);

        sc.close();
    }
}
