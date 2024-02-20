import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max =0, mn = 100;

        int arr[] = new int[7];

        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 7; i++) {
            if (arr[i] % 2 == 1) {
                max += arr[i];
                if (mn > arr[i]) {
                    mn = arr[i];
                }
            }
        }
        if (max == 0 && mn == 100) {
            System.out.println(-1);
        } else {
        System.out.println(max);
        System.out.println(mn);
        }
    }
}
