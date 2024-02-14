import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        for (int i = 1; i < star+1; i++) {
            for (int k = 0; k < i ; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = 1; i < star; i++){
            for (int k = star; k > i; k--) {
                System.out.print('*');
            }
            System.out.println();
        }
        sc.close();
        }

}
