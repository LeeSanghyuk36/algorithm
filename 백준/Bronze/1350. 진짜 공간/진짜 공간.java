import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * 클러스터 크기가 주어짐.
         * 데이터를 넣으면 512 보다 크면 그만큼 또 512가 필요함
         * 클러스터보다 크면 +1 해주기
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        long size = Long.parseLong(br.readLine());
        for (int i = 0; i < n; i++) {
            long file = Long.parseLong(st.nextToken());
            // 파일이 0이 아니면
            if (file != 0) {
                cnt += (file / size);
                if (file % size != 0) {
                    cnt++;
                }
            }
        }
        System.out.println(size * cnt);


    }
}
