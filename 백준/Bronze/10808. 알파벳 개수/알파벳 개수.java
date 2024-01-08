import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = sc.nextLine();

//        System.out.println(alphabet);

        /**
         * 나온 알파벳을 어떻게 해야 돌릴 수 있나. 흠
         * a~z array 만들고, for 돌면서 alphabet의 각 인덱스가 az의 a~z까지 각각 같은지 확인 하고, 같다면 그 차례에
         * azIndexNumer 에 +1 을 하면 되는데.
         */
        int[] cnt = new int[26];
        for (int i = 0; i < alphabet.length(); i++) {
            cnt[alphabet.charAt(i) - 97]++;
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(cnt[i]+" ");
        }




        sc.close();

    }
}
