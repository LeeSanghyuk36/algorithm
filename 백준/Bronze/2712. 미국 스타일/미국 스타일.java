import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int i = 0; i < tc; i++) {
            double value = sc.nextDouble(); // 최초 값
            String unit = sc.next(); // 단위
            double convertedValue = 0; // 변환된 값

            // 기존 단위가 kg 일 때
            if (unit.equals("kg")) {
                convertedValue = value *2.2046;
                System.out.printf("%.4f lb\n", convertedValue);
            } else if (unit.equals("lb")) {
                convertedValue = value *0.4536;
                System.out.printf("%.4f kg\n", convertedValue);
            } else if (unit.equals("l")) {
                convertedValue = value * 0.2642;
                System.out.printf("%.4f g\n", convertedValue);
            } else if (unit.equals("g")) {
                convertedValue = value * 3.7854;
                System.out.printf("%.4f l\n", convertedValue);
            }
        }
        sc.close();
    }
}
