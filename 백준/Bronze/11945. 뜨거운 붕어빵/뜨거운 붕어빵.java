import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            while (sc.hasNext()) {
                StringBuilder sb = new StringBuilder(sc.next());
                System.out.println(sb.reverse());
            }
        }
        sc.close();

    }
}
