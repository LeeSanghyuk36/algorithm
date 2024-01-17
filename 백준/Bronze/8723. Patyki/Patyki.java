import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lines = new int[3];
        for (int i = 0; i < 3; i++) {
            lines[i] = sc.nextInt();
        }
        Arrays.sort(lines);
        if (lines[0] == lines[2]) {
            System.out.println(2);
        } else if (lines[2] * lines[2] == lines[0] * lines[0] + lines[1] * lines[1]) {
            System.out.println(1);
        } else {
            System.out.println(0);
        } 
    }
}
