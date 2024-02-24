import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 음악의 수
        int Q = sc.nextInt(); // 테스트케이스의 수

        int[] musicTimes = new int[N]; // 음악의 재생 시간을 저장할 배열
        int[] musicIndices = new int[N]; // 시간대별로 재생되는 음악의 번호를 저장할 배열

        // 각 음악의 재생 시간과 번호를 입력받고, 누적하여 시간대별로 재생되는 음악의 번호를 구합니다.
        int total = 0;
        for (int i = 0; i < N; i++) {
            int time = sc.nextInt();
            musicTimes[i] = time;
            total += time;
            musicIndices[i] = total - 1; // 시간대별로 재생되는 음악의 번호를 저장합니다.
        }

        // 각 테스트케이스별로 해당 시간대에 재생되는 음악을 구합니다.
        for (int i = 0; i < Q; i++) {
            int t = sc.nextInt();
            int index = binarySearch(musicIndices, t); // 이진 탐색을 통해 시간대에 맞는 음악의 번호를 찾습니다.
            System.out.println(index + 1); // 해당 시간대에 재생되는 음악의 번호를 출력합니다.
        }

        sc.close();
    }

    // 이진 탐색을 사용하여 시간대에 맞는 음악의 번호를 찾습니다.
    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return left;
    }
}