import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받은 시간을 :을 기준으로 분리하여 리스트에 저장
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int[] time = new int[3];
        for (int i = 0; i < 3; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0; // 가능한 방법의 수를 저장할 변수

        // 모든 시, 분, 초에 대해 가능한 조합을 계산
        for (int h = 0; h < 3; h++) {
            for (int m = 0; m < 3; m++) {
                for (int s = 0; s < 3; s++) {
                    // 시, 분, 초가 서로 다르고, 시가 1에서 12 사이, 분과 초가 0에서 59 사이인 경우 카운트 증가
                    if (h != m && m != s && s != h && time[h] >= 1 && time[h] <= 12 && time[m] >= 0 && time[m] <= 59 && time[s] >= 0 && time[s] <= 59) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count); // 가능한 방법의 수 출력
    }
}
