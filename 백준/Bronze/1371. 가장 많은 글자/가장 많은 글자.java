import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 알파벳을 카운트할 배열을 생성합니다. 알파벳은 총 26개입니다.
        int[] alphabet = new int[26];

        // 입력에서 각 줄을 읽어서 알파벳의 출현 횟수를 세어 alphabet 배열에 저장합니다.
        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            // 각 문자열에서 알파벳만 카운트합니다.
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);

                // 소문자 알파벳인 경우에만 카운트를 증가시킵니다.
                if (ch >= 'a' && ch <= 'z') {
                    alphabet[ch - 'a']++;
                }
            }
        }

        // 가장 많이 출현한 알파벳을 찾습니다.
        int max = 0;
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, alphabet[i]);
        }

        // 가장 많이 출현한 알파벳을 출력합니다.
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] == max) {
                System.out.print((char) (i + 'a'));
            }
        }

        sc.close();
    }
}
