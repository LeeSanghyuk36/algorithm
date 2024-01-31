import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String word = sc.nextLine();

            // 중복 제거
            StringBuilder sb = new StringBuilder();
            sb.append(word.charAt(0));
            for (int j = 1; j < word.length(); j++) {
                if (word.charAt(j) != word.charAt(j - 1)) {
                    sb.append(word.charAt(j));
                    }
            }
            System.out.println(sb);
        }
        sc.close();
    }
}
