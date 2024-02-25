import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] currentTimeStr =br.readLine().split(":");
        String[] startTimeStr = br.readLine().split(":");

        int currentTimeInSeconds = timeToSeconds(currentTimeStr);
        int startTimeInSeconds = timeToSeconds(startTimeStr);

        int timeDifferenceInSeconds = startTimeInSeconds = startTimeInSeconds - currentTimeInSeconds;
        if (timeDifferenceInSeconds < 0) {
            timeDifferenceInSeconds += 24 * 60 * 60;
        }
        System.out.printf("%02d:%02d:%02d\n",
                timeDifferenceInSeconds / 3600, // hour
                (timeDifferenceInSeconds % 3600) / 60, // minuitte
                timeDifferenceInSeconds % 60); // seconds
    br.close();
    }

    // 시간을 초로 변환하는 메서드
    private static int timeToSeconds(String[] timeStr) {
        int hours = Integer.parseInt(timeStr[0]) * 3600;
        int minutes = Integer.parseInt(timeStr[1]) * 60;
        int seconds = Integer.parseInt(timeStr[2]);
        return hours + minutes + seconds;
    }
}
