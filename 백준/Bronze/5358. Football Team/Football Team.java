import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (sc.hasNextLine()) {
            String player = sc.nextLine();
            if (player.isEmpty()) {
                break; // 입력이 비어있으면 반복문 종료
            }

            char[] arr = player.toCharArray();
            for (char c : arr) {
                if (c == 'e') {
                    sb.append('i');
                } else if (c == 'i') {
                    sb.append('e');
                } else if (c == 'E') {
                    sb.append('I');
                } else if (c == 'I') {
                    sb.append('E');
                } else {
                    sb.append(c);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim()); // 결과 출력 (공백 제거)
        sc.close();
    }
}
