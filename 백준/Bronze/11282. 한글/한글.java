import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * 인코딩을 사용한 문제다. 알파벳 문제와 같은 것으로 생각된다.
         * 우선 입력을 받는 Scanner
         * int kr = next
         *  kr + utf-8
         * sout(kr)
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 한글 제일 앞 ASCII Code 값은 44031이다.
        // 따라서 받은 값에 44031을 더하면 ASCII CODE로 변환할 수 있다.
        n += 44031;

        // 한글로 출력하기 위해 char 형으로 형 변환
        char kr = (char) n;

        System.out.println(kr);

    }
}
