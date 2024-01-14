import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        System.out.println("Gnomes:");
        for (int i = 1; i <= tc; i++) {
                int gnome1 = sc.nextInt();
                int gnome2 = sc.nextInt();
                int gnome3 = sc.nextInt();
                if (gnome1 < gnome2 && gnome2 < gnome3) {
                    System.out.println("Ordered");
                } else if(gnome1 > gnome2 && gnome2 > gnome3)  {
                    System.out.println("Ordered");
                } else if (gnome1 > gnome2 && gnome2 < gnome3) {
                    System.out.println("Unordered");
                } else if (gnome1 < gnome2 && gnome2 > gnome3) {
                    System.out.println("Unordered");

            }
        }
        sc.close();
    }
}
