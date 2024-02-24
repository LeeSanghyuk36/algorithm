import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double d = sc.nextInt();

        double[] arr = new double[4];

        arr[0] = a/c + b/d;
        arr[1]  = c/d + a/b;
        arr[2]  = d/b + c/a;
        arr[3] = b/a + d/c;

        double max = 0;
        int n = 0;
        for (int i = 0; i < 4; i++) {
            if (max < arr[i]) {
                max = arr[i];
                n = i;
            }
        }
        System.out.println(n);
        sc.close();
    }
}
