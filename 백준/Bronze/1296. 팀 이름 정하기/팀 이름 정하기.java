import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        팀 이름 짜기
        공식 줌. 4가지 변수 값 계산 필요.
        L O V E
        각 개수를 만들어져있는 식에 입력. 이름의 우승 확률을 구할 수 있음
        ((L+O)*(L+V)*(L+E)*(O+V)*(V+E)) mod 100
        영어 이름과 이름 후보 N개 주어졌을 때, 우승 할 확률이 가장 높은 팀 이름을
        구해 보자. 확률이 가장 높은 팀이 여러가지인 경우 사전 순으로 가장 앞서는 팀 이름이 우승 확률이 가장 높음
        오케, for 2개 돌면서 값을 정해야하는거네.
         */
        Scanner sc = new Scanner(System.in);

        //입력
        String yd = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());

        //yd 이름에서 각 문자 등장하는 횟수 세기.
        int[] ydCnt = {0, 0, 0, 0};

        for (char c : yd.toCharArray()) {
            switch (c) {
                case 'L':
                    ydCnt[0]++;
                    break;
                case 'O':
                    ydCnt[1]++;
                    break;
                case 'V':
                    ydCnt[2]++;
                    break;
                case 'E':
                    ydCnt[3]++;
                    break;
            }
        }
        String resultName = "";
        int maxScore = -1;

        for (int i = 0; i < n; i++) {
            String teamName = sc.nextLine();
            int score = getScore(teamName, ydCnt);

            if (score > maxScore || (score == maxScore && resultName.compareTo(teamName) > 0)) {
                maxScore = score;
                resultName = teamName;
            }
        }

        System.out.println(resultName);
        sc.close();
    }

    public static int getScore(String name, int[] baseCounts) {
        int[] cnts = Arrays.copyOf(baseCounts, baseCounts.length);

        for (char c : name.toCharArray()) {
            switch (c) {
                case 'L':
                    cnts[0]++;
                    break;
                case 'O':
                    cnts[1]++;
                    break;
                case 'V':
                    cnts[2]++;
                    break;
                case 'E':
                    cnts[3]++;
                    break;
            }
        }
        return ((cnts[0] + cnts[1]) % 100) * ((cnts[0] + cnts[2]) % 100) * ((cnts[0] + cnts[3] % 100) *
                ((cnts[1] + cnts[2]) % 100) * ((cnts[1] + cnts[3]) % 100) *
                ((cnts[2] + cnts[3]) % 100))%100;
    }
}
