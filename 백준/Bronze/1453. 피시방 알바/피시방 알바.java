import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int customer = sc.nextInt();
        Set<Integer> selectedSeats = new HashSet<>();
        
        int cnt = 0;
        for (int i = 0; i < customer; i++) {
            int seat = sc.nextInt();
            if (!selectedSeats.contains(seat)) {
                selectedSeats.add(seat);
            } else cnt++;
        }
        System.out.println(cnt);
    }
}
