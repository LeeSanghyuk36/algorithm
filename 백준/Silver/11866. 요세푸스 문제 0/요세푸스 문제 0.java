import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        // 초기에 원형 테이블에 사람들을 넣어줍니다.
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        // k-1 번째까지의 사람들은 그대로 큐에서 빼서 맨 뒤에 넣어줍니다.
        for (int i = 0; i < k - 1; i++) {
            queue.add(queue.poll());
        }

        // 제거할 사람들을 출력 문자열에 추가하고 큐에서 제거합니다.
        while (!queue.isEmpty()) {
            sb.append(queue.poll());
            if (!queue.isEmpty()) {
                sb.append(", ");
                // k-1 번째까지의 사람들은 그대로 큐에서 빼서 맨 뒤에 넣어줍니다.
                for (int i = 0; i < k - 1; i++) {
                    queue.add(queue.poll());
                }
            }
        }

        sb.append(">");
        System.out.println(sb.toString());

        sc.close();
    }
}