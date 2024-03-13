import jdk.jshell.Snippet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 알파벳 소문자 단어. 임의의 두 부분 골라서 쪼개기. 그러면 3개가 됨.
         * 적어도 길이가 1 이상인 단어야한다.
         * 그 뒤 쪼갠 단어들 3개를 각각 앞뒤로 뒤집고. 이제 합칩니다.
         * 그렇게 만든 단어가 사전 순으로 가장 앞에 오는 단어를 출력하도록.
         * 1.랜덤 쪼개기.
         *      1번부터 막히는데,
         * 2.각 단어들 뒤집기
         *      이건 비교적 쉽다고 생각된다. array.sort를 사용할 생각이다.
         * 3.각 단어의 [i]가 charAt(65)와 비교했을때 가장 작은 단어를 출력
         *      처음으로 만들어진 단어의 각각의 charAt(i)를 쪼개서 'a'와 비교해서 가장 숫자가 작은 것을 고른다.
         *      만약 같다면 다음 (i)를 비교해본다.
         *
         */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int len = input.length();

        String minLexicographic = null;

        for (int i = 1; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                String part1 = reversString(input.substring(0,i));
                String part2 = reversString(input.substring(i, j));
                String part3 = reversString(input.substring(j));

                String newString = part1 + part2 + part3;

                if (minLexicographic == null || newString.compareTo(minLexicographic) < 0) {
                    minLexicographic = newString;
                }
            }
        }

        System.out.println(minLexicographic);
    }

    private static String reversString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
