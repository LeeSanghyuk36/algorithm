import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 테스트 케이스 수를 입력받습니다.
            String inputLine = sc.nextLine();
            if (inputLine.equals("0")) { // 입력이 '0' 하나로 끝나면 종료
                break;
            }

            String[] inputArr = inputLine.split(" ");
            int a = Integer.parseInt(inputArr[0]); // 나무의 나이
            int[] factors = new int[a * 2];

            for (int i = 0; i < a * 2; i++) {
                factors[i] = Integer.parseInt(inputArr[i + 1]); // splitting factor와 가지치기 한 가지의 수
            }
            int leaves = calculateLeaves(a, factors); //잎 수 계산
            System.out.println(leaves);
        }
        sc.close();
    }

    public static int calculateLeaves(int a, int[] factors) {

        int leaves = 1; // 나뭇잎 수를 1로 초기화
        for (int i = 0; i < a; i++) {
            leaves = leaves * factors[2 * i] - factors[2 * i + 1];
            //잎의 수 계산
        }
        return leaves;
    }
}
