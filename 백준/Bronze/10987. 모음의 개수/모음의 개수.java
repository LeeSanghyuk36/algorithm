import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 단어를 입력받고 그 단어에 'a,e,i,o,u' 가 몇개가 있는지 출력하는 코드 제작.
         * 글자를 받고 그 글자의 길이만큼 for를 반복하면서 word[i]가 a, e, i, o, u가 같은지 확인.
         * 같다면 cnt++
         *
         */
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int cnt = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(ch =='a' || ch == 'e' || ch == 'i' || ch =='o'|| ch == 'u') cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}
