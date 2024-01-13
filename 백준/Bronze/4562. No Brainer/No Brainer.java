import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int set = sc.nextInt();
        for (int i = 1; i <= set; i++) {
            int eatBrains = sc.nextInt();
            int needBrains = sc.nextInt();
            if (eatBrains < needBrains) {
                System.out.println("NO BRAINS");
            } else {
                System.out.println("MMM BRAINS");
            }
        }
        sc.close();
    }
}

