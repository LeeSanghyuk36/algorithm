import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /* 정수 하나
         * 상근이는 카드 n 개
         * 정수 m 개가 주어졌을 때 이 카드를 상근이가 갖고있는지 아닌지?
         * m개의 수를 상근이가 갖고있으면 1, 아니면 0 출력
         *
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        boolean[] cards = new boolean[20000001];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            cards[num + 10000000] = true;
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (cards[num + 10000000]) {
                sb.append("1 ");
            } else sb.append("0 ");
        }

        System.out.println(sb.toString());
        br.close();

    }
}
