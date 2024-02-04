import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int third = sc.nextInt();
        int second = sc.nextInt();
        int first = second + (second - third);
        System.out.println(first);
    }
}
