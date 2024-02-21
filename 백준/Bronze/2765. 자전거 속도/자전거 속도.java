import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int trip = 1;
        while (true) {
            double pie = sc.nextDouble();
            double torque = sc.nextDouble();
            double time = sc.nextDouble();

            if (torque == 0) break;

            double distance = Math.PI*pie * torque /  63360.0;

            double mph = distance / time * 3600 ;


            System.out.printf("Trip #%d: %.2f %.2f%n", trip, distance, mph);
            trip++;
        }
        sc.close();
    }
}
