import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 처음에 64센치. 그걸 반씩 잘라가면서 남은 막대의 합이 x랑 같다면
         * 남아있는 몇 개의 막대로 붙여서 x를 만들 수 있는지?
         * 64 / 2
         * 수[] 에  64 삭제, 64/2, 64/2 추가.
         * 배열 합이 x가 맞는지 확인.
         * 아니면 배열 오름차순 정렬 후 32/2, 32/2, 64/2
         *
         */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String binary = Integer.toBinaryString(x);
        int count = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }
        System.out.println(count);

    }

}
