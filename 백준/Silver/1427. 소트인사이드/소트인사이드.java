import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        int nl = n.length();

        char[] narr = new char[nl];

        for (int i = 0; i < nl; i++) {
            narr[i] = n.charAt(i);
        }

        Arrays.sort(narr);

        for (int i = nl-1; i >= 0; i--) {
            System.out.print(narr[i]);

        }


        sc.close();

    }
}
