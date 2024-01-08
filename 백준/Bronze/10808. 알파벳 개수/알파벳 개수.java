import java.util.HashMap; // HashMap을 사용하기 위한 import
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next(); // 알파벳 소문자로 이루어진 단어 입력 받기

        Map<Character, Integer> alphabetCount = new HashMap<>(); // 알파벳 개수를 저장할 HashMap

        // 입력받은 단어의 각 알파벳 개수 카운팅
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            // HashMap에 해당 알파벳이 이미 있는지 확인하고, 있으면 기존 값에 1을 더하고, 없으면 1로 설정
            alphabetCount.put(ch, alphabetCount.getOrDefault(ch, 0) + 1);
        }

        // 결과 출력
        for (char c = 'a'; c <= 'z'; c++) {
            // HashMap에서 해당 알파벳의 값(value)을 가져오고, 없으면 0을 출력
            System.out.print(alphabetCount.getOrDefault(c, 0) + " ");
        }

        sc.close();
    }
}
