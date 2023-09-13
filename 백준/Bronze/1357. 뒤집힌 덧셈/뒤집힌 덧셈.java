import java.util.Scanner;

public class Main {
    public static int rev(int num) {
        int revNum = 0;
        while (num > 0) {
            revNum = (revNum * 10) + (num % 10);
            num /= 10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        /*
        각 수를 역순 만들고 더한 다음에
        또 역순으로 배치
        rev 함수를 만들어서 역순으로 만들고

        위쪽에서 result = rev(rev(x) + rev(y))
        sout result.

        rev = 수를 역으로 만드는 함수
        첫 번째에 마지막 수를 넣고 끝날 때 까지 계속 넣기.
         */
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int revX = rev(x);
        int revY = rev(y);

        int sum = revX + revY;

        int result = rev(sum);

        System.out.println(result);
    }
}
