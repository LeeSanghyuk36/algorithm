import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** 1 2 3 4 5
         *  박스 개수 n, 책 개수 m
         *  박스 용량 5 6 4 2 5
         *  넣을 용량 5 5 5 5 5
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] boxStorage = new int[n];
        int[] bookStorage = new int[m];

        for (int i = 0; i < n; i++) {
            boxStorage[i]= sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            bookStorage[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (boxStorage[i] >= bookStorage[j]) {
                    boxStorage[i] -=bookStorage[j];
                    bookStorage[j] = 0;
                } else continue;
            }
        }
        int trash = 0;
        for (int i = 0; i < n; i++) {
            trash += boxStorage[i];
        }
        System.out.println(trash);
    }
}
